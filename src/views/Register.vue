<template>
  <div id="register" class="text-center">
    <br>
    
    <form class="form-register" @submit.prevent="register">
      <h1 class="h3 mb-3 font-weight-normal">Create Account</h1>
      <div class="login-container">
      <div class="alert alert-danger" role="alert" v-if="registrationErrors">
        There were problems registering this user.
      </div>
  
      <label for="username" class="sr-only">Enter a username:  </label>
      <input
        type="text"
        id="username"
        class="form-control"
        placeholder="Username"
        v-model="user.username"
        required
        autofocus
      />
      <br>
      <label for="password" class="sr-only">Enter a password:  </label>
      <input
        type="password"
        id="password"
        class="form-control"
        placeholder="Password"
        v-model="user.password"
        required
      />
      
      <input
        type="password"
        id="confirmPassword"
        class="form-control"
        placeholder="Confirm Password"
        v-model="user.confirmPassword"
        required
      />
      <br><br>
      <button class="btn btn-lg btn-primary btn-block" type="submit">
        Create Account
      </button>
      <br><br>
      <router-link :to="{ name: 'login' }">
        <small>If you already have an account, click here.</small>
      </router-link>
      </div>
  <br>
  <br>
  <br>
    </form>
  </div>
</template>

<script>
export default {
  name: 'register',
  components: {
  
  },
  data() {
    return {
      user: {
        username: '',
        password: '',
        confirmPassword: '',
        role: 'user',
      },
      registrationErrors: false,
    };
  },
  methods: {
    register() {
      fetch(`${process.env.VUE_APP_REMOTE_API}/register`, {
        method: 'POST',
        headers: {
          Accept: 'application/json',
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(this.user),
      })
        .then((response) => {
          if (response.ok) {
            this.$router.push({ path: '/login', query: { registration: 'success' } });
          } else {
            this.registrationErrors = true;
          }
        })

        .then((err) => console.error(err));
    },
  },
};
</script>

<style>
.login-container {
  background: #ebebeb;
  padding: 12px;
  border-radius: 15px;
  text-align: left;
}

button[type="submit"] {
  background: #28d;
  border-color: transparent;
  color: #fff;
  cursor: pointer;
  border-radius: 15%;
}

button[type="submit"]:hover {
  background: #17c;
}

/* Buttons' focus effect */
button[type="submit"]:focus {
  border-color: #05a;
}

</style>
