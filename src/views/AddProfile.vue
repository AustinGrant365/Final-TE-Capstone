<template>
    <div class="experience grid-area">
        <h3>Add Job Experience</h3>

        <input
          type="text"
          id="username"
          class="form-control"
          placeholder="Institution"
          v-model="experience.institution"
        />
        <input
          type="text"
          id="username"
          class="form-control"
          placeholder="Job Title"
          v-model="experience.jobtitle"
        />
        <textarea
            rows="2"
            cols="50"
            placeholder="Responsibilities"
            v-model="experience.res"
          />
        <div class="date-entry">
          <label class="start">
            Start Date
            <input
              type="date"
              id="start-date"
              class="form-control"
              v-model="experience.startdate"
            />
          </label>
          <label class="end">
            End Date
            <input
              type="date"
              id="end-date"
              class="form-control"
              v-model="experience.enddate"
            />
          </label>
        </div>
        <div class="button">
          <br />
          <button type="submit">Add Experience</button>
        </div>
      </div>

</template>