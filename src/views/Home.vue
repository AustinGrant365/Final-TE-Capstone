<template>
  <div class="home">
   <br><br>
    <body>
    <section id="firstName">
    <h4>Welcome 'firstName'</h4>
    <br>
    <img src="#" alt="profile pic">
    </section>   
    
   
<section id="bio">
<p><strong>Summary</strong>
<br>Bio/Description...
</p>
</section>

<section id="about">
<p><strong><small>About</small></strong><br>
Full Name<br>
Occupation
</p>
</section>

<section id="Project1">
<h4>Project 1</h4>
<p>Information about project 1...</p>
</section>

<section id="listExperience">
<p>
  <strong>Technical Experience</strong>
  <br>
  <ul>
    <li>Project 1</li>
    <li>Project 2</li>
    <li>Project 3</li>
    </ul>
</p>
</section>

<section id="fProjects">
  <p>
    <small><Strong>Featured Projects:</Strong></small>
  </p>
</section>
    <br><br>
    </body>
  </div>
</template>

<script>
export default {
  name: 'home'
}
</script>

<style scoped>
/* .grid-container {
  display: grid;
  grid-template: 150px / auto auto auto;
} */

* {
  background-color: rgb(223, 223, 223);
  border-radius: 15px;  
}

body {
  display: grid;
  grid-template-columns: 1fr 2fr 1fr;
  grid-template-areas: 
  "firstName bio fProjects"
  "about listExperience fProjects"
  ". Project1 .";
grid-gap: 10px;
}

#bio {
  grid-area: bio;
}
#Project1 {
  grid-area: Project1;
}
#about {
  grid-area: about;
  font-size: 8pt;
}

#firstName {
  grid-area: firstName;
}

#fProjects {
  grid-area: fProjects;
}

#listExperience {
  grid-area: listExperience;
}
</style>
