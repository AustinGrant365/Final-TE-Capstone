<template>
  <div id="app">
    <header></header>
    <div id="nav">
      <router-link to="/">Home</router-link>
    </div>
    <router-view/>
    <footer></footer>
  </div>
</template>


<script>
import Header from './components/Header.vue'
import Footer from './components/Footer.vue'


export default {
  name: 'app',
  components: {
    Header,
    Footer
  }
}
</script>