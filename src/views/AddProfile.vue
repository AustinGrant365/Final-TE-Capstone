<template>
<div class="grid-container" style="background-image: url('https://www.intechnic.com/hs-fs/hubfs/intechnic_2017/assets/images/landing/footer/map-xl.jpg?width=1680&height=824&name=map-xl.jpg');">
        <h3 class="title grid-area">Tell us a bit about yourself </h3>
    <div class="add grid-area">

      <form class="form-add-profile" @submit.prevent="add">
        <input
          type="text"
          id="firstname"
          class="form-control"
          placeholder="First Name"
          v-model="add.firstName"
        />

        <input
          type="text"
          id="lastname"
          class="form-control"
          placeholder="Last Name"
          v-model="add.lastName"
        />
       
        <input
          type="text"
          id="email"
          class="form-control"
          placeholder="Email Address"
          v-model="add.email"
        />
     
        <textarea
            rows="2"
            cols="50"
            class="form-control"
            placeholder="Summary"
            v-model="add.summary"
          />

        <div class="number-entry">
          <label>
            Phone Number
          <input type="number"
          id="phonenumber"
          class="form-control"
          placeholder="(xxx)xxx-xxxx"
          v-model="add.phoneNumber"
          />  
          </label>
          <label >
            Date of Birth
            <input
              type="date"
              id="birthdate"
              class="form-control"
              v-model="add.birthday"
            />
          </label>

          
          <label >
            Select Cohort
            <select id="cohort" class="form-control"  v-model="add.cohort">
  <option value="0">Cohort 0</option>
  <option value="1">Cohort 1</option>
  <option value="2">Cohort 2</option>
  <option value="3">Cohort 3</option>
</select>
          </label>
        </div>
         
        <div class="button">
          <router-link to="/">
          <button type="submit">Submit Profile</button>
          </router-link>
        </div>
      </form>
      </div>
</div>
</template>

<script>
export default {

  data() {
    return {
  add: {
        firstName: "",
        lastName: "",
        email: "",
        summary: "",
        phoneNumber: "",
        birthday: "",
        cohort: ""
      },
     registrationErrors: false,
      homeUrl: "http://localhost:8083"
  };
  },
  
methods: {



  add() {
      //fetch(`${process.env.VUE_APP_REMOTE_API}/register`, {
        fetch(`${this.homeUrl}/addprofile`, {
            method: "POST",
        headers: {
            Accept: "application/json",
          "Content-Type": "application/json"
        },
        body: JSON.stringify(this.user)
      })
        .then(response => {
            console.log(response.json());
          if (response.ok) {
              this.$router.push({
                  path: "/login",
              query: { registration: "success" }
            });
          } else {
              this.registrationErrors = true;
          }
        })
        .then(err => console.error(err));
    }
}
}
</script>

<style scoped>

.grid-container {
  display: grid;
  grid-template-columns: 2fr 3fr 2fr;
  grid-template-areas:
    ". t . "
    ". add . ";
  grid-gap: 20px;
  text-align: center;
}

@media only screen and (max-width: 768px) {
    .grid-container {
  display: grid;
  grid-template-columns: 1fr 4fr 1fr;
  grid-template-areas:
    ". t . "
    ". add . ";
  grid-gap: 20px;
  text-align: center;
}
    
}
.add {
  grid-area: add;
  background: #ebebeb;
  padding: 12px;
  border-radius: 15px;
  width: 100%;
  margin: 25px;
  text-align: center;
}
.title {
  grid-area: t;
  padding-top: 35px;
  color: #ebebeb;
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
.form-control {
  grid-area: start-date;
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
  margin: 10px;
}

.number-entry {
  display: grid;
  grid-template-columns: 1fr 1fr 1fr;
  grid-template-areas:
    "co pn bd ";
  grid-gap: 10px;
}
#birthdate{
  grid-area: bd;
}
#phonenumber{
  grid-area: pn;
}
#cohort {
  grid-area: co;
}
</style>