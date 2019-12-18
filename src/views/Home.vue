<template>
  <div
    class="grid-container"
    style="background-image: url('https://www.intechnic.com/hs-fs/hubfs/intechnic_2017/assets/images/landing/footer/map-xl.jpg?width=1680&height=824&name=map-xl.jpg');"
  >
    <div class="username grid-area">
      <div class="userbox">
        <img
          :src="`https://ui-avatars.com/api/?name=` + profile.firstName + `+` + profile.lastName + `&size=150`"
          class="default-image"
        />
        <br />
        <h3>{{ profile.username }}</h3>
      </div>
    </div>

    <div class="bio grid-area">
      <label>
        <h4 id="bio-title">Bio:</h4>
        <p class="bio-script">{{ profile.summary }}</p>
        <p class="bio-script">Phone Number: {{profile.phoneNumber}}  </p>
        <p class="bio-script">Email Address: {{profile.email}}</p>
        <p class="bio-script">Birth Date: {{profile.birthday}}</p>
        <p class="bio-script">Cohort: {{profile.cohort}}</p>
      </label>
      <router-link to="/editprofile">
        <button type="button" class="btn btn-primary">Edit Resume Information</button>
      </router-link>
      <router-link to="/addprofile">
        <button type="button" class="btn btn-primary">Edit Account Information</button>
      </router-link>
      <router-link to="/">
        <button type="button" class="btn btn-primary">Make Profile Visible</button>
      </router-link>
    </div>

    <div class="resume grid-area">
      <label>
        <h4>Experience:</h4>
        <div class="experience" v-for="jobs in experience" v-bind:key="jobs.id">
          <h5
            class="jt grid-area"
          >{{ jobs.jobtitle }} from {{ jobs.startdate }} to {{ jobs.enddate }}</h5>

          <p class="r grid-area">{{ jobs.description}}</p>
        </div>
      </label>
      <label>
        <h4>Education:</h4>
        <div class="experience" v-for="school in education" v-bind:key="school.id">
          <h5
            class="jt grid-area"
          >{{ school.school }} from {{ school.startdate }} to {{ school.enddate }}</h5>

          <p class="r grid-area">{{ school.description}}</p>
        </div>
      </label>
      <label>
        <h4>Portfolio:</h4>
        <div class="experience" v-for="project in portfolio" v-bind:key="portfolio.id">
          <h5
            class="jt grid-area"
          >{{ project.name }} from {{ project.startdate }} to {{ project.enddate }}</h5>

          <p class="r grid-area">{{ project.description}}</p>
        </div>
      </label>
      <br />
    </div>

    <div class="tools grid-area">
      <h5>Add to Portfolio</h5>
      <label>
        <form class="porfolio">
          <input type="text" id="firstname" class="form-control" placeholder="Project name" />

          <textarea rows="2" cols="50" class="form-control" placeholder="Description" />

          <div class="number-entry grid-area">
            <label>
              Start Date
              <input type="date" id="sd grid-area" class="form-control" />
            </label>
            <label>
              End Date
              <input type="date" id="ed grid area" class="form-control" />
            </label>
          </div>
          <router-link to="/">
            <button type="button" class="btn btn-primary">Add to Portfolio</button>
          </router-link>
        </form>
      </label>
    </div>
  </div>
</template>

<script>
import auth from "../auth";

export default {
  name: "home",

  data() {
    return {
      profile: {
        username: "username",
        firstName: "firstName",
        lastName: "lastName",
        email: "email@email.om",
        summary: "bio",
        phoneNumber: "9999999999",
        birthday: "birthday",
        cohort: "cohort"
      },
      experience: [
        {
          jobtitle: "Plumber",
          startdate: "01/23/2018",
          enddate: "present",
          description: "Had to clean a LOT of shit"
        },
        {
          jobtitle: "Janitor",
          startdate: "04/2/2017",
          enddate: "01/23/2018",
          description: "Had to clean a LOT of floors"
        }
      ],
      education: [
        {
          school: "Frankton VA",
          startdate: "January of 02",
          enddate: "February of 03",
          description: "I've made some mistakes"
        },
        {
          school: "Swartz Creek High",
          startdate: "January of 01",
          enddate: "February of 02",
          description: "I've made some mistakes"
        }
      ],
      portfolio: [
        {
          name: "Frankton VA",
          startdate: "January of 02",
          enddate: "February of 03",
          description: "I've made some mistakes"
        },
        {
          name: "Swartz Creek High",
          startdate: "January of 01",
          enddate: "February of 02",
          description: "I've made some mistakes"
        }
      ]
    };
  },
  methods: {
    getUserInfo() {
      this.profile.username = auth.getUser().username;
      console.log(this.profile);
      fetch(`${this.homeUrl}`, {
        method: "GET",
        headers: {
          Accept: "application/json",
          "Content-Type": "application/json"
        },
        body: JSON.stringify(this.profile)
      });
    }
  }
};
</script>

<style scoped>
.grid-container {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr 1fr 1fr 1fr;
  grid-template-areas:
    ". . . . . . "
    ". username bio bio bio ."
    ". resume resume resume resume ."
    ". tools tools tools tools .";

  grid-gap: 20px;
}
.number-entry {
  display: grid;
  grid-template-columns: 1fr 1fr;
  grid-template-areas: "sd ed ";
  grid-gap: 20px;
}
.resume {
  grid-area: resume;
}
h4 {
  color: white;
}
.experience {
  display: grid;
  grid-template-columns: 1fr 1fr;
  grid-template-areas:
    "jt jt "
    "r r ";

  grid-gap: 5px;
  padding: 10px;
  border-radius: 15px;
  margin: 5px;
  background-color: #dfdede;
  width: 100%;
  border: 10px solid;
  border-color: #eeeded;
}

.jt {
  grid-area: jt;
}
.sd {
  grid-area: sd;
}
.r {
  grid-area: r;
}
.bio {
  padding: 10px;
  border-radius: 15px;
  margin: 5px;
  background-color: #dfdede;
  border: 10px solid;
  border-color: #eeeded;
}
#bio-title {
  color: black;
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
input {
  margin-right: 10px;
}
.username {
  grid-area: username;
}
.userbox {
  box-sizing: content-box;
  text-align: center;
  border-radius: 15px;
  border: 10px solid;
  border-color: #eeeded;
  margin: 5px;
  padding: 10px;

  background-color: #ffffff;
}

.newsfeed {
  grid-area: newsfeed;
}

.tools {
  grid-area: tools;
  border: 10px solid;
  border-radius: 15px;
  border-color: #eeeded;
  padding: 10px;
  background-color: #ffffff;
}

.default-image {
  text-align: center;
  border-radius: 15px;
  margin: 10px;
}
.portfolio {
  width: 100%;
}

label {
  width: 100%;
}
button {
  margin: 10px;
}
</style>
