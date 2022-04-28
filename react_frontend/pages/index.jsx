import { useState, useEffect } from "react";
import { Button, Center, Container, Flex, SimpleGrid, Text } from "@chakra-ui/react";
import { Api } from "../Api";
import { useRouter } from "next/router";
import UserCard from "../components/UserCard";

export default function Home() {
    const [users, setUsers] = useState([]);
    const [currentUser, setCurrentUser] = useState(null);
    const [following, setFollowing] = useState([]);
    const api = new Api;
    const router = useRouter();
    useEffect(() => {
        setCurrentUser(localStorage.getItem("user"));
        api.getUsers().then(res => {
            setUsers(res);
            res.map((user) => {
                if (user.user_name == localStorage.getItem("user"))
                    setCurrentUser(user);
            });
            console.log("body", res);
        });
    }, []);

    useEffect(() => {
        if (currentUser) {
            api.getFollowing(currentUser.user_id).then(res => {
                setFollowing(res);
                console.log(res);
            },
            );
        }
    }, [currentUser]);

    const handleFollow = (user, add) => {
        const body = { user_id: currentUser?.user_id, other_id: user.user_id };
        if (add) {
            api.followUser(body).then(res => {
                console.log(res);
                api.getFollowing(currentUser?.user_id).then(res => {
                    setFollowing(res);
                    console.log("Following", res);
                });
            }).catch(err => console.log(err));
        }

        if (!add)
            api.unfollowUser(body).then(res => console.log(res)).catch(err => console.log(err));

    };

    return (
        <Container>
            <Center><Text textStyle="logo.md">Scientists Social Network</Text></Center>
            {currentUser ? <Flex direction="row-reverse">
                <Button my="1rem" ms="1rem" textStyle="logo.xs" variant="primary" onClick={() => {
                    localStorage.removeItem("user");
                    window.location.reload();
                }}>Logout</Button>
                <Text my="1rem" textStyle="logo.xs">Welcome {currentUser.user_name}!</Text>
            </Flex> :
                <Flex my="1rem" justify="end">
                    <Button me="1rem" variant="primary" onClick={() => router.push("/login")}>Login</Button>
                    <Button variant="primary" onClick={() => router.push("/signup")}>Signup</Button>
                </Flex>
            }

            <SimpleGrid columns={4} spacingX={4}>
                {users?.map(user => <UserCard user={user} key={user.user_id} currentUser={currentUser} following={following} handleFollow={handleFollow} />)}
            </SimpleGrid>
        </Container>

    );
}
