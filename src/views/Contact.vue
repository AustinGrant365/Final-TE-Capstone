<template>
<div class="contact">
    <br>
    <br>
    <body>
    <h2>Contact US</h2>
    <div section id="logo">
<img src="https://images.squarespace-cdn.com/content/55ef2da9e4b03f6e1ef0cd28/1573837430685-80KGNIB9IVQO3GMY344H/Stacked+logo_white+behind+the+mark.png?content-type=image%2Fpng">
    </div>
    <br>
    <p>Thank you for visiting our site.<br>
    You may contact us with the following information:
    </p>
    <br>
   


    <div class="contactus">
    <p><strong>Tech Elevator</strong><br>
    Email: <i>Hello@techelevator.com</i><br>
    Phone: <i>877.606.3203</i>
    </p>
    </div>
    <br>
    <div section id="link1">
        <p>To learn more about Tech Elevator, <a href="http://techelevator.com/">click here.</a></p>
    </div>
   <section id="info2">
<button id="alert" v-on:click="myFunction()"><img src="http://cdn.onlinewebfonts.com/svg/img_519962.png" height="22" width="22"/></button>

   </section>
    <br>
    <hr>

    </body>
</div>
</template>

<script>
export default {
  name: 'contact',
    methods: {
        myFunction() {
    alert("Tech Elevator is an immersive 14-week coding bootcamp with tracks in Java and . NET. Their mission is to elevate people, companies, and communities. ... For the final capstone project, students will work together on a business project, building a fully-functional app using either Java or . NET.");
    }
}
}
</script>

<style scoped>

img {
    width: 25%;
}

</style>