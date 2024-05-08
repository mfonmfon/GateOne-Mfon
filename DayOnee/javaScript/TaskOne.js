const prompt = requrie("prompt sync")();
let total = 0;
let scores = 0;

for(let index = 0; index < 10; index++){

	scores = prompt ("Enter a number:");
	total = total + scores;

}
console.log(total);