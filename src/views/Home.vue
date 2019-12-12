<template>

  <div class="grid-container">

    

      <div class="username grid-area">
        <img v-bind:src="require(`@/assets/${image}.jpg`)" class="default-image" alt="profile-pic"
          height="150px"
          width="150px"
         />
        <br>
        <h4>{{ username }}</h4>
      </div>

      <div class="bio grid-area">
        
          <h2>Bio:</h2>
          <p>{{ bio }}</p>
        
      </div>

      <div class="tools grid-area">
        
        <h2>Tools:</h2>
        <ul>
          <li>change username</li>
          <li>edit bio</li>
          <li>add portfolio</li>
          <li>invite user</li>
          <li>add experience</li>
          <li>add education</li>
          <li>all editing links</li>

        </ul>







      </div>

      <div class="newsfeed grid-area">
          
           <h1>newsfeed:</h1>

          <ul>
          <li>portfolio</li>
          <li>student profile</li>
          <li>blog</li>
          <li>etc</li>
          <li>advertisement</li>
          <li>fake news</li>
          

        </ul>
      </div>

    
  </div>
</template>

<script>
export default {
  name: "home",

  data() {
    return {
    image: "default",
    username: 'Chris Day',
    bio: "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.",
    }
  }

  // methods: {
  //   getImage(image){
  //     return "'../assets/' + default.jpg"
  //   }
  // }

 
};
</script>

<style scoped>
.grid-container {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr 1fr 1fr 1fr;
  grid-template-areas:
    ". . . . . . "
    ". username bio bio bio ."
    ". tools tools tools tools ."
    ". newsfeed newsfeed newsfeed newsfeed .";

  grid-gap: 20px;
}

.bio {
  grid-area: bio;
  padding: 10px;
}

.username {
  box-sizing: border-box; 
  grid-area: username;
  text-align: center;
  border: 3px solid;
  border-radius: 15px;
  border-color: #3281a8;
  margin:5px;
}

.newsfeed {
  grid-area: newsfeed;
}

.tools {
  grid-area: tools;
  border: solid;
  border-radius: 15px;
  border-color: #3281a8;
  padding: 10px;
}

.default-image {
  border-radius: 15px;
}

</style>
