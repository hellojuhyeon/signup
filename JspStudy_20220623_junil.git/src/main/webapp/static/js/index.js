const signupBtn = document.querySelectorAll("nav ul li");

signupBtn[0].onclick =() => {
	location.href = "/signup";
}

signupBtn[1].onclick =() => {
	location.href = "/signin";
}

load();
function load(){
	$.ajax({
		type:"get",
		url:"/api/v1/principal",
		dataType:"json",
		success:(response)=>{
			console.log(JSON.stringify(response));
			if(response != null){
				loadUserInfo(response);
			}
		},
		error:()=>{
			alert("요청실패");
		}
	});
}

function loadUserInfo(principal){
	const userInfo = document.querySelector(".user-info");
	userInfo.innerHTML = `
	<li>${principal.name}</li>
	<li>${principal.username}</li>
	<li>${principal.email}</li>
	`;
}