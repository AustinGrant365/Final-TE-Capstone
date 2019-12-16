<template>
<div class="grid-container">
    <div class="add grid-area">

        <h3>Tell us a bit about yourself </h3>

        <input
          type="text"
          id="firstname"
          class="form-control"
          placeholder="First Name"
        />

        <input
          type="text"
          id="lastname"
          class="form-control"
          placeholder="Last Name"
        />
       
        <input
          type="text"
          id="email"
          class="form-control"
          placeholder="Email Address"
        />
     
        <textarea
            rows="2"
            cols="50"
            class="form-control"
            placeholder="Summary"
          />

        <div class="number-entry">
          <label>
            Phone Number
          <input type="number"
          id="phonenumber"
          class="form-control"
          placeholder="(xxx)xxx-xxxx"
          />  
          </label>
          <label >
            Date of Birth
            <input
              type="date"
              id="birthdate"
              class="form-control"
            />
          </label>

          
          <label >
            Cohort
            <select id="cohort" class="form-control">
  <option value="0">Cohort 0</option>
  <option value="1">Cohort 1</option>
  <option value="2">Cohort 2</option>
  <option value="3">Cohort 3</option>
</select>
          </label>
        </div>
         
        <div class="button">
          <button type="submit">Submit Profile</button>
        </div>
      </div>
</div>
</template>

<script>
export default {
  
}
</script>

<style scoped>

.grid-container {
  display: grid;
  grid-template-columns: 2fr 3fr 2fr;
  grid-template-areas:
    ". . . "
    ". add . ";
  grid-gap: 20px;
  text-align: center;
}
.add {
  grid-area: add;
  background: #ebebeb;
  padding: 12px;
  border-radius: 15px;
  width: 100%;
  margin: 10px;
  text-align: center;
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