let sum = 1;
for( let i = 1; i <= 10; i++) {
	let factorial = 1;
	for(let j = 1; j <= i; j++) {
		factorial *= j
	}
	let e = 1 / factorial
	sum += e;
	console.log(sum);
}
