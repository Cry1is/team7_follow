import { Box, Button, Center, FormControl, FormErrorMessage, FormLabel, Input, Text, useToast, VStack } from "@chakra-ui/react";
import { useState } from "react";
import { useRouter } from "next/router";
import { Api } from "../Api";

export const Login = (props) => {

    const [username, setUsername] = useState(null);
    const [password, setPassword] = useState(null);
    const usernameError = username === "";
    const passwordError = password === "";
    const api = new Api;
    const toast = useToast();
    const router = useRouter();

    const handleLogin = () => {
        const body = { user_name: username, user_password: password };
        api.login(body).then(res => {
            if (res) {
                localStorage.setItem("user", username);
                router.push("/");
            } else{
                toast({
                    title: "Error",
                    description: "Invalid username or password",
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
                <Text display="flex" alignItems="center" justifyContent="center" mt="2rem" textStyle="logo.sm">Login</Text>
                <FormControl isRequired display="flex" flexWrap="wrap" alignItems="center" justifyContent="center">
                    <Box mt="1rem" width="51%">
                        <FormLabel>Username</FormLabel>
                        <Input isInvalid={usernameError} borderColor="accent.100" id="username" placeholder="Username" value={username} onChange={(e) => setUsername(e.target.value)} />
                        {usernameError ? (<FormErrorMessage textStyle="logo.xs">Username is required</FormErrorMessage>) : null}
                    </Box>
                    <Box mt="1rem" width="51%">
                        <FormLabel>Password</FormLabel>
                        <Input isInvalid={passwordError} borderColor="accent.100" id="password" type="password" placeholder="Password" value={password} onChange={(e) => setPassword(e.target.value)} />
                    </Box>
                </FormControl>
                <Button mx="auto" display="block" justifyContent="center" w="15rem" mt="2rem" variant="primary" onClick={handleLogin}>Login</Button>
            </Box>
        </VStack>
    );
};

export default Login;