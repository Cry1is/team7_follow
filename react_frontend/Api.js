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

}