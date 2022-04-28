import { Box, Button, SimpleGrid, Text } from "@chakra-ui/react";

const UserCard = (props) => {
    return (
        <Box p=".5rem" mb="1rem" h="5.5rem" borderWidth="3px" borderColor={"accent.80"} borderRadius={8} backgroundColor="gray.100" position="relative">
            <SimpleGrid columns={2}>
                <Text textStyle="logo.xs">{props.user.user_name}</Text>
                <Button mx="1rem" mt="1rem" position="absolute" top="0" right="0" alignSelf="end" variant="primary" w="5rem">Follow</Button>
            </SimpleGrid>
        </Box>
    );
};

export default UserCard;