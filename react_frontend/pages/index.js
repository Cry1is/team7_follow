import Head from 'next/head'
import Image from 'next/image'
import { useState, useEffect } from 'react'
import { Box, Button, Center, Container, SimpleGrid, Text } from '@chakra-ui/react'
import { Api } from '../Api'
import { useRouter } from 'next/router'
import UserCard from '../components/UserCard'

export default function Home() {
  const [users, setUsers] = useState([])
  const api = new Api;
  const router = useRouter();
  // useEffect(() => {
  //   api.getUsers().then(res => {
  //     setUsers(res);
  //     console.log(res);
  //   })
  // },[]);

  return (
    <Container>
    <Center><Text textStyle="logo.md">Scientists Social Network</Text></Center>
    <SimpleGrid columns={4} spacingX={4}>
        <UserCard /><UserCard /><UserCard /><UserCard /><UserCard /><UserCard /><UserCard /><UserCard /><UserCard /><UserCard /><UserCard /><UserCard />
    </SimpleGrid>
    </Container>
    
  )
}
