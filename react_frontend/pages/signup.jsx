import { Box, Button, Center, Flex, FormControl, FormLabel, Input, Text, useToast, VStack } from "@chakra-ui/react";
import { useState } from "react";
import { useRouter } from "next/router";
import { Api } from "../Api";

export const Signup = (props) => {

    const [username, setUsername] = useState("");
    const [password, setPassword] = useState("");
    const [displayName, setDisplayName] = useState("");
    const [imageUrl, setImageUrl] = useState("");
    const api = new Api;
    const toast = useToast();
    const router = useRouter();

    const handleSignup = () => {
        const body = { user_name: username, user_password: password, display_name: displayName, display_avatar: imageUrl };
        api.signup(body).then(res => {
            if (res) {
                localStorage.setItem("user", username);
                router.push("/");
            } else {
                toast({
                    title: "Error",
                    description: "An error occurred when creating your account. Please fill out all fields.",
                    status: "error",
                    duration: 9000,
                    isClosable: true,
                    position: "top-right",
                });
            }

        });
    };

    return (
        <VStack>
            <Center><Text textStyle="logo.md">Scientists Social Network</Text></Center>
            <Box alignContent="center" p=".5rem" top="12rem" h="50rem" w="50%" borderWidth="3px" borderColor={"accent.80"} borderRadius={8} backgroundColor="gray.100" position="absolute" mx="auto">
                <Text display="flex" alignItems="center" justifyContent="center" mt="2rem" textStyle="logo.sm">Sign Up</Text>
                <FormControl isRequired display="flex" flexWrap="wrap" alignItems="center" justifyContent="center">
                    <Box mt="1rem" width="51%">
                        <FormLabel>Display Name</FormLabel>
                        <Input borderColor="accent.100" id="displayname" placeholder="Display Name" value={displayName} onChange={(e) => setDisplayName(e.target.value)} />
                    </Box>
                    <Box mt="1rem" width="51%">
                        <FormLabel>Username</FormLabel>
                        <Input borderColor="accent.100" id="username" placeholder="Username" value={username} onChange={(e) => setUsername(e.target.value)} />
                    </Box>
                    <Box mt="1rem" width="51%">
                        <FormLabel>Password</FormLabel>
                        <Input borderColor="accent.100" id="password" type="password" placeholder="Password" value={password} onChange={(e) => setPassword(e.target.value)} />
                    </Box>
                    <Box mt="1rem" width="51%">
                        <FormLabel>Avatar</FormLabel>
                        <Input borderColor="accent.100" id="avatar" placeholder="Imgur link to Avatar" value={imageUrl} onChange={(e) => setImageUrl(e.target.value)} />
                    </Box>
                </FormControl>
                <Button mx="auto" display="block" justifyContent="center" w="51%" mt="2rem" variant="primary" onClick={handleSignup}>Sign Up</Button>
                <Flex maxW="51%" mt="1rem" position="relative">
                    <Button display="block" variant="primary" position="absolute" left="48%" onClick={() => router.push("/")}>Back</Button>
                    <Button display="block" variant="primary" position="absolute" right="-48%" onClick={() => router.push("/login")}>Login</Button>
                </Flex>
            </Box>
        </VStack>
    );
};

export default Signup;