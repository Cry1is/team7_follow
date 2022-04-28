import { useState, useEffect } from "react";
import { Button, Center, Container, Flex, SimpleGrid, Text } from "@chakra-ui/react";
import { Api } from "../Api";
import { useRouter } from "next/router";
import UserCard from "../components/UserCard";

export default function Home() {
    const [users, setUsers] = useState([]);
    const api = new Api;
    const router = useRouter();
    useEffect(() => {
        api.getUsers().then(res => {
            setUsers(res);
            console.log("body", res);
        });
    }, []);

    return (
        <Container>
            <Center><Text textStyle="logo.md">Scientists Social Network</Text></Center>
            <Flex my="1rem" justify="end">
                <Button me="1rem" variant="primary" onClick={() => router.push("/login")}>Login</Button>
                <Button variant="primary" onClick={() => router.push("/signup")}>Signup</Button>
            </Flex>
            <SimpleGrid columns={4} spacingX={4}>
                {users?.map(user => <UserCard user={user} key={user.id} />)}
            </SimpleGrid>
        </Container>

    );
}
