<template>
  <div class="grid-container">

    

      <div class="username grid-area">
        <img src="#" alt="profile pic" />
        <h4>Username</h4>
      </div>

      <div class="bio grid-area">
        
          <strong>Summary</strong>
        
      </div>

      <div class="tools grid-area">
        <strong>tools</strong>
      </div>

      <div class="newsfeed grid-area">
        
          <small>
            <Strong>newsfeed</Strong>
          </small>
        
      </div>

    
  </div>
</template>

<script>
export default {
  name: "home"
};
</script>

<style scoped>
.grid-container {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr 1fr 1fr 1fr;
  grid-template-rows: 50px 50px auto;
  grid-template-areas:
    ". username bio bio bio ."
    ". tools tools tools tools ."
    ". newsfeed newsfeed newsfeed newsfeed .";

  grid-gap: 10px;
}

.bio {
  grid-area: bio;
}

.username {
  grid-area: username;
}

.newsfeed {
  grid-area: newsfeed;
}

.tools {
  grid-area: tools;
}
</style>
