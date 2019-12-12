<template>
<div class="register-parent">
  <div id="register" class="text-center">
    <br>
    
    <form class="form-register" @submit.prevent="register">
      <h1 class="h3 mb-3 font-weight-normal">Create Account</h1>
      <div class="login-container">
      <div class="alert alert-danger" role="alert" v-if="registrationErrors">
        There were problems registering this user.
      </div>
      <p>Select account type:</p>
      <input 
        type="radio"
        id="student"
        name="account-type"
        value="student"
        />
      <label for="student"> Student</label>
      
      <input 
        type="radio"
        id="employer"
        name="account-type"
        value="employer"
        /> 
      <label for="employer"> Employer</label>
      
<br><br>
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
      <!-- <label for="password" class="sr-only"></label> -->
      <input
        type="password"
        id="password"
        class="form-control"
        placeholder="Password"
        v-model="user.password"
        required
      />
      <br>
      <input
        type="password"
        id="confirmPassword"
        class="form-control"
        placeholder="Confirm Password"
        v-model="user.confirmPassword"
        required
      />
      <br>
      <button class="btn btn-lg btn-primary btn-block" type="submit">
        Create Account
      </button>
      <br>     <router-link :to="{ name: 'login' }">
        <small>If you already have an account, click here.</small>
      </router-link>
      </div>
  <br>
  <br>
  <br>
    </form>
  </div>
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

 input {
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

button[type="submit"] {
  background: #28d;
  border-color: transparent;
  color: #fff;
  cursor: pointer;
  border-radius: 15px;
}
/* .form-control {
  border-radius: 15px;
} */


input[type="text"] {
  border-radius: 15px;
}

input[type="password"] {
  border-radius: 15px;
}

button[type="submit"]:hover {
  background: #17c;
}

/* Buttons' focus effect */
button[type="submit"]:focus {
  border-color: #05a;
}

.form-register label {
  display : inline-block;
  width: 200px;
  padding: 10px;
  border: solid 2px #ccc;
  transition: all 0.3;
  width: 20%;
  text-align: center;
  border-radius: 15px;
  margin: 8px;
}

.form-register input[type="radio"]{
  display: none;
  
}

.form-register 
input[type="radio"]:checked + label {
  border: solid 2px #17c;
}

#register {
  display: inline-block;
  width: 50%;

}

.register-parent {
  text-align: center;
}
</style>
