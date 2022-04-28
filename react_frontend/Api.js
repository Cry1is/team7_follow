import config from "./config.json";

export class Api {
    async getUsers() {
        console.log(config.api_url);
        return await fetch(`${config.api_url}/users`, {
        }).then(res => res.json()).catch(err => console.log(err));
    }

    async login(body) {
        return await fetch(`${config.api_url}/login`, {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(body),
        }).then(res => res.json()).catch(err => console.log(err));
    }

    async signup(body) {
        return await fetch(`${config.api_url}/signup`, {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(body),
        }).then(res => res.json()).catch(err => console.log(err));
    }

    async followUser(body) {
        return await fetch(`${config.api_url}/follows/in`, {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(body),
        }).then(res => res.json()).catch(err => console.log(err));
    }

    async unfollowUser(body) {
        return await fetch(`${config.api_url}/follows/out`, {
            method: "POST",
            headers: {
                "Content-Type": "application/json",
            },
            body: JSON.stringify(body),
        }).then(res => res.json()).catch(err => console.log(err));
    }

    async getFollowing(id) {
        return await fetch(`${config.api_url}/follows/${id}/out`, {
            method: "GET",
            headers: {
                "Content-Type": "application/json",
            },
        }).then(res => res.json()).catch(err => console.log(err));
    }
}