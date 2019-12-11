<template>
<div id="main-container">
  <nav class="dropdownmenu">
   
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
  <br>

    <!-- <ul>
    <li><router-link to="/">Home</router-link></li>
    <li><router-link to="/login">Login</router-link></li>
    <li><router-link to="/register">register</router-link></li>
  </ul> -->
</div>
</template>

<script>
export default {
    name: 'Header'
}
</script>

<style>

@import url('https://fonts.googleapis.com/css?family=Acme&display=swap');


.dropdownmenu ul, .dropdownmenu li {
	margin: 0;
	padding: 0;
  
}
.dropdownmenu ul {
	background: gray;
	list-style: none;
	width: 100%;
  
}
.dropdownmenu li {
	float: left;
	position: relative;
	width:auto;
}
.dropdownmenu a {
	background: #30A6E6;
	color: #FFFFFF;
	display: block;
	padding: 10px 25px;
	text-align: center;
	text-decoration: none;
	-webkit-transition: all .25s ease;
	-moz-transition: all .25s ease;
	-ms-transition: all .25s ease;
	-o-transition: all .25s ease;
	transition: all .25s ease;
}
.dropdownmenu li:hover a {
	background: #202020;
}
#submenu {
	left: 0;
	opacity: 0;
	position: absolute;
	top: 35px;
	visibility: hidden;
	z-index: 1;
}
li:hover ul#submenu {
	opacity: 1;
	top: 40px;	/* adjust this as per top nav padding top & bottom comes */
	visibility: visible;
}
#submenu li {
	float: none;
	width: 100%;
}
#submenu a:hover {
	background: #DF4B05;
}
#submenu a {
	background-color:#000000;
}



</style>

