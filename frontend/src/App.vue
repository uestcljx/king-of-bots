<template>
  <nav-bar></nav-bar>
  <router-view/>
</template>

<script>
  import {ref} from 'vue';
  import $ from 'jquery';
import NavBar from './components/NavBar.vue';
import "bootstrap/dist/css/bootstrap.min.css";
import "bootstrap/dist/js/bootstrap"

  export default {
    name: "App",
    setup: () => {
        let bot_name = ref("");
        let bot_rating = ref("");
        $.ajax({
            url: "http://localhost:3000/pk/getbotinfo",
            type: "get",
            success: resp => {
                bot_name.value = resp.name;
                bot_rating.value = resp.rating;
            }
        });
        return { bot_name, bot_rating };
    },
    components: { NavBar }
}
  
</script>

<style>
  body {
    background-image: url("./assets/background.png");
    background-size: cover
  }
</style>
