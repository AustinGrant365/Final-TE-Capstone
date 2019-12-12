<template>
  <div class="login-page">
    <br />

    <div id="login" class="text-center">
      <form class="form-signin" @submit.prevent="login">
        <div id="login-container" class="text-center">
          <div
            class="alert alert-danger"
            role="alert"
            v-if="invalidCredentials"
          >Invalid username and password!</div>
          <div
            class="alert alert-success"
            role="alert"
            v-if="this.$route.query.registration"
          >Thank you for registering, please sign in.</div>

          <p>Log in to your Profolio</p>
          <input
            type="text"
            id="username"
            class="form-control"
            placeholder="Username"
            v-model="user.username"
            required
            autofocus
          />
          <br />
          <label for="password" class="sr-only">
            <br />
          </label>
          <input
            type="password"
            id="password"
            class="form-control"
            placeholder="Password"
            v-model="user.password"
            required
          />

          <br />
          <button type="submit">Sign in</button>
          <br />
          <router-link to="/register">Need an account?</router-link>
        </div>
      </form>
      <br />
      <br />
      <br />
    </div>
  </div>
</template>

<script>
import auth from "../auth";

export default {
  name: "login",
  components: {},
  data() {
    return {
      user: {
        username: "",
        password: ""
      },
      invalidCredentials: false,
      homeUrl: "http://localhost:8083"
    };
  },
  methods: {
    login() {
      console.log(JSON.stringify(this.user));
      //fetch(`${process.env.VUE_APP_REMOTE_API}/login`, {
      fetch(this.homeUrl + `/login`, {
        method: "POST",
        headers: {
          Accept: "application/json",
          "Content-Type": "application/json"
        },
        body: JSON.stringify(this.user)
      })
        .then(response => {
          console.log(JSON.stringify(response));
          if (response.ok) {
            console.log(JSON.stringify(response.toString()));
            return response.text();
          } else {
            this.invalidCredentials = true;
          }
        })
        .then(token => {
          console.log(token);
          if (token != undefined) {
            if (token.includes('"')) {
              token = token.replace(/"/g, "");
            }
            auth.saveToken(token);
            this.$router.push("/");
          }
        })
        .catch(err => console.error(err));
    }
  }
};
</script>

<style>
.login-page {
  text-align: center;
}

.text-center {
  display: inline-block;
  width: 100%;
}

#login input {
  box-sizing: border-box;
  display: block;
  width: 100%;
  border-width: 1px;
  border-style: solid;
  padding: 16px;
  outline: 0;
  font-family: inherit;
  font-size: 0.95em;
  border-radius: 15px;
}

#login-container {
  background: #ebebeb;
  padding: 12px;
  border-radius: 15px;
  width: 25%;
}

#login button[type="submit"] {
  background: #28d;
  border-color: transparent;
  color: #fff;
  cursor: pointer;
  width: 100%;
  border-radius: 15px;
}

#login button[type="submit"]:hover {
  background: #17c;
}

/* Buttons' focus effect */
#login button[type="submit"]:focus {
  border-color: #05a;
}
</style>
