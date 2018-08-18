


<?php

/* SIMPLE LOGIN SCRIPT FOR ADMIN IN PHP */
if(isset($_POST['login'])){

  authenticate();


}
else{
?>

<h2>Admin Area</h2>
       <form action="" method="post">
			<input type="text" name="usernanme" placeholder="Username" />
			<input type="password" name="pass" placeholder="Password" />
            <input type="submit" name="login" value="Login">
	   </form> 

<?php

}
 		

 		

 		function authenticate(){

 			$usernamex = "Admin";
 			$Passwordx = "Pass123";

 			if($_POST['usernanme'] == "Admin" && $_POST['pass'] == "Pass123"){

 				echo "<h3>Welcome Admin</h3>"
 			}

 			else{

                echo "Ivalid Username or Password";
 			}


 		}
?>