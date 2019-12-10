<template>
<div class="nav-bar">
    <h1>Profolio</h1>
    <ul>
    <li><a href="#">Home</a></li>
    <li><a href="#">Page 2</a></li>
    <li><a href="#">Page 3</a>
      <ul id="submenu">
        <li><a href="#">Link</a></li>
        <li><a href="#">Link 2</a></li>
        <li><a href="#">Link 3</a></li>
      </ul>
    </li>
    <li><a href="#">News</a></li>
    <li><a href="#">Contact Us</a></li>
  </ul>
</div>
</template>

<script>
export default {
    name: 'Header'
}
</script>