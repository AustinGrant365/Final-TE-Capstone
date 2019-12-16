<template>
  <div class="grid-container">
    <div class="username grid-area">
      <img :src="`https://ui-avatars.com/api/?name=` + firstName + `+` + lastName + `&size=150`" class="default-image"/>
      <br />
      <h4>{{ username }}</h4>
    </div>

    <div class="bio grid-area">
      <label>Bio:
      <p>{{ bio }}</p>
      </label>
      <label> Experience:
      <div class="experience" v-for="jobs in experience" v-bind:key="jobs.id">
        <h4>{{ jobs.jobtitle }}</h4>

        <h3>{{ jobs.startdate }}</h3>

        <p>{{ jobs.enddate }}</p>
      </div>
      </label>
      <br>
      <router-link to="/editprofile">
        <button type="button" class="btn btn-primary">Edit Profile</button>
      </router-link>
    </div>

    <div class="tools grid-area">
      <h2>Tools:</h2>

      <router-link to="/addprofile">
        <button type="button" class="btn btn-primary">Add to Profile</button>
      </router-link>

      
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
      username: "Chris Day",
      firstName: "Chris",
      lastName: "Day", 
      bio:
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
    };

    experience: [
        {
          jobtitle: "Plumber",
          startdate: "01/23/2018",
          enddate: "present"
        }
      ]
  }
  // register() {
  //   //fetch(`${process.env.VUE_APP_REMOTE_API}/register`, {
  //   fetch(`${this.homeUrl}/register`, {
  //     method: "POST",
  //     headers: {
  //       Accept: "application/json",
  //       "Content-Type": "application/json"
  //     },
  //     body: JSON.stringify(this.user)
  //   })
  //     .then(response => {
  //       console.log(response.json());
  //       if (response.ok) {
  //         this.$router.push({
  //           path: "/login",
  //           query: { registration: "success" }
  //         });
  //       } else {
  //         this.registrationErrors = true;
  //       }
  //     })
  //     .then(err => console.error(err));
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
  margin: 5px;
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
  text-align: center;
  border-radius: 15px;
  margin: 10px;}
</style>
