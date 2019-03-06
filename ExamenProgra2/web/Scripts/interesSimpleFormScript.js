$(document).ready(function(){
   $("#myform").validate({
       rules:{
           cliente: "required",
           capitalinicial:{
               required: true,
               min: 100,
               max: 500000
           },
           tasainteres: {
               required: true,
               
               min: 1,
               max: 10
           },
           tiempoinversion:{
               required: true,
               
               min: 2,
               max: 8
           }
       }
   });
    
});

