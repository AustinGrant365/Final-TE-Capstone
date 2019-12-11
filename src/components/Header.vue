<template>
<div id="main-container">
  <!-- <nav class="dropdownmenu">
   
  <ul>
	<li>Profolio</li>
    <li><router-link to="/">Home</router-link></li>
    <li><router-link to="/login">Login</router-link></li>
    <li><router-link to="/register">Register</router-link>
      <ul id="submenu">
        <li><router-link to="#">Link</router-link></li>
        <li><router-link to="#">Link 2</router-link></li>
        <li><router-link to="#">Link 3</router-link></li>
      </ul>
    </li>
    <li><router-link to="#">News</router-link></li>
    <li><router-link to="#">Contact Us</router-link></li>
  </ul>
  </nav>
  <br> -->









<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">Profolio</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <router-link class="nav-link" to="/">Home <span class="sr-only">(current)</span></router-link>
      </li>
      <li class="nav-item">
        <router-link class="nav-link" to="/login">Login</router-link>
      </li>
      <li class="nav-item">
        <router-link class="nav-link" to="/register">Register</router-link>
      </li>
	  <li class="nav-item">
        <router-link class="nav-link" to="/contact">Contact</router-link>
      </li>
    </ul>
    <form class="form-inline my-2 my-lg-0">
      <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>
  </div>
</nav>
</div>



</template>

<script>
export default {
    name: 'Header'
}
</script>

<style>

@import url('https://fonts.googleapis.com/css?family=Acme&display=swap');





</style>

