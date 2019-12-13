<template>
  <div class="grid-container">
    <form class="form grid-area">
      
      <div class="experience grid-area">
        <h3>Add Job Experience</h3>

        <input type="text" id="username" class="form-control" placeholder="Username" />
        <div class="date-entry">
          <p class="start">Start Date</p>
          <p class="end">End Date</p>
          <input type="date" id="start-date" class="form-control" />
          <input type="date" id="end-date" class="form-control" />
        </div>
        <div class="button">
            <br>
        <button type="submit">Add Experience</button>
      </div>
      </div>
      <div class="education grid-area">
        <h3>Add Education</h3>

        <input type="text" id="username" class="form-control" placeholder="Username" />
        <div class="date-entry">
          <p class="start">Start Date</p>
          <p class="end">End Date</p>
          <input type="date" id="start-date" class="form-control" />
          <input type="date" id="end-date" class="form-control" />
        </div>
        <div class="button">
            <br>
        <button type="submit">Add Education</button>
      </div>
      <div class="username grid-area">
        <h3>Edit Username</h3>
        <input type="text" id="username" class="form-control" placeholder="Username" />
      </div>
      <div class="username grid-area">
        <h3>Edit Password</h3>
        <input type="password" id="username" class="form-control" placeholder="Password" />
      </div>
      <div class="bio grid-area">
        <h3>Edit Bio</h3>
        <textarea rows="3" cols="50" placeholder="Tell us a little about yourself." />
      </div>
      </div>
      <div class="button">
        <button type="submit">Save Changes</button>
      </div>
    </form>
    <div class="profiledisplay grid-area">
      <p>View Profile</p>
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
      bio:
        "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum."
    };
    // experience: {
    //     jobtitle: "",
    //     startdate: "",
    //     enddate: "",
    // };
    // education: {
    //     school: "",
    //     startdate: "",
    //     enddate: ""
    // };
  }
};
</script>

<style scoped>
.grid-container {
  display: grid;
  grid-template-columns: 1fr 4fr 1fr;
  grid-template-areas:
    ". . . "
    ". form  . "
    ". profiledisplay .";
  grid-gap: 20px;
}

.date-entry {
  display: grid;
  grid-template-columns: 1fr 1fr;
  grid-template-areas:
    "start end"
    "start-date end-date";
  grid-gap: 0px;
}

.start {
  grid-area: start;
}
.end {
  grid-area: end;
}
#start-date {
  grid-area: start-date;
}
#end-date {
  grid-area: end-date;
}

.form {
  grid-area: form;
  background: #ebebeb;
  padding: 12px;
  border-radius: 15px;
  width: 100%;
}

textarea {
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

.bio {
  grid-area: bio;
  padding: 10px;
}

.username {
  grid-area: username;
  padding: 10px;
}

.education {
  grid-area: education;
  padding: 10px;
}

.experience {
  grid-area: experience;
  padding: 10px;
}

.button {
  text-align: center;
}
.profiledisplay {
  grid-area: profiledisplay;
  padding: 16px;
}
</style>
