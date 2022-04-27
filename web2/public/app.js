function isChecked(item){
	return item.checked;
}
function save(){
	//var element = document.getElementById("age");
	//console.log("Age is " + element.value);
	
	var Genders = document.getElementsByName('gender');
	console.log(Genders);
	
	var selectedGender;
	for(let i=0;i<Genders.length;i++){
		if(Genders[i].checked) selectedGender = Genders[i];
	}
	console.log(selectedGender);
	
	//selectedGender = Genders.filter(item => item.checked);
	
	//console.log("Selected Gender is " + selectedGender.value);
	
	
}