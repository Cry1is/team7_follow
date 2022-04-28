import { Box, Button, Flex, Text } from "@chakra-ui/react";
import Image from "next/image";
const UserCard = (props) => {

    const handleFollow = (user, add) => props.handleFollow(user, add);

    return (
        <Box p=".5rem" mb="1rem" h="5.5rem" borderWidth="3px" borderColor={"accent.80"} borderRadius={8} backgroundColor="gray.100" position="relative">
            <Flex >
                <Image src={props.user.display_avatar} alt="User avatar" width={64} height={64} layout="fixed"/>
                <Box ms="1rem">
                    <Text overflow="hidden" whiteSpace="nowrap" maxW="10rem" textOverflow="ellipsis" maxH="2rem" textStyle="logo.xxs">{props.user.display_name}</Text>
                    <Text textStyle="logo.xxxs">@{props.user.user_name}</Text>
                </Box>
                {props.currentUser?.user_name && props.user.user_name != props.currentUser?.user_name && !props.following?.some((u) => u.user_id === props.user.user_id)
                    ? <Button mx="1rem" mt="1rem" position="absolute" top="0" right="0" alignSelf="end" variant="primary" w="5rem" onClick={() => handleFollow(props.user, true)}>Follow</Button> : null}
                {props.currentUser?.user_name && props.user.user_name != props.currentUser?.user_name && props.following?.some((u) => u.user_id === props.user.user_id)
                    ? <Button mx="1rem" mt="1rem" position="absolute" top="0" right="0" alignSelf="end" variant="primary" w="5rem" onClick={() => handleFollow(props.user, false)}>Unfollow</Button> : null}
                {props.user?.user_name == props.currentUser?.user_name ? <Text me="1rem" position="absolute" right={0} textStyle="logo.xs">You!</Text> : null}
            </Flex>
        </Box>
    );
};

export default UserCard;