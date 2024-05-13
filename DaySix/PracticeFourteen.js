const prompt = require("prompt-sync")();

function findingRunWayLength(){

	let length = 0;
	let speed = prompt("Enter the speed");
	let acceleration = prompt("Enter the acceleration");
	
	totalSpeed = speed * speed;
	length = (totalSpeed  * acceleration);

	console.log(length);

}
console.log(findingRunWayLength());