<template>
<div class="nav-bar">
    <h1>Profolio</h1>
    <ul>
    <li><router-link to="/">Home</router-link></li>
    <li><router-link to="/login">Login</router-link></li>
    <li><router-link to="/register">register</router-link></li>
  </ul>
</div>
</template>

<script>
export default {
    name: 'Header'
}
</script>