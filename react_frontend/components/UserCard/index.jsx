import { Box, Button, Flex, Text } from "@chakra-ui/react";
import Image from "next/image";
const UserCard = (props) => {
    return (
        <Box p=".5rem" mb="1rem" h="5.5rem" borderWidth="3px" borderColor={"accent.80"} borderRadius={8} backgroundColor="gray.100" position="relative">
            <Flex >
                <Image src={props.user.display_avatar} alt="User avatar" width={64} height={64} layout="fixed"/>
                <Box ms="1rem">
                    <Text overflow="hidden" whiteSpace="nowrap" maxW="10rem" textOverflow="ellipsis" maxH="2rem" textStyle="logo.xxs">{props.user.display_name}</Text>
                    <Text textStyle="logo.xxxs">@{props.user.user_name}</Text>
                </Box>
                {props.currentUser && props.user.user_name != props.currentUser ? <Button mx="1rem" mt="1rem" position="absolute" top="0" right="0" alignSelf="end" variant="primary" w="5rem">Follow</Button> : null}
                {props.user?.user_name == props.currentUser ? <Text me="1rem" position="absolute" right={0} textStyle="logo.xs">You!</Text> : null}
            </Flex>
        </Box>
    );
};

export default UserCard;