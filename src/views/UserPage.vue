<template>
    <div id="main-container">
        <nav class="dropdownmenu">
  <ul>
    <li><a href="#">Home</a></li>
    <li><a href="#">Page 2</a></li>
    <li><a href="#">Page 3</a>
      <ul id="submenu">
        <li><a href="#">Link</a></li>
        <li><a href="#">Link 2</a></li>
        <li><a href="#">Link 3</a></li>
      </ul>
    </li>
    <li><a href="#">News</a></li>
    <li><a href="#">Contact Us</a></li>
  </ul>
</nav>


        <img src="#" alt="profile pic">
        <h2>Welcome, <!-- USERNAME -->  </h2>
        <br>
        <br>
        <p>
            <strong>Title for Summary</strong><br>
            <!-- description for summary -->
        </p>
        <br>
        <br>
        <p> 
            <strong>Technical Experience</strong><br>
            <!-- List of projects -->
            <ul>
                <li>Project 1</li>
                <li>Project 2</li>
                <li>Project 3</li>
            </ul>

            <p id="bio"><strong>Name:</strong><small><!--Insert Name --></small></p>


        
        



    </div>

  

</template>

<style>
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
	font: bold 12px/20px sans-serif;
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


