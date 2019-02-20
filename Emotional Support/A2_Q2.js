var input=-1; //see comment below for explanation
var generalCounter=0;
var oddCounter=0;
var evenCounter=0;

// javascript being javascript, it sees input=0 as input = null
while (input!="" && input!=null) {
  input = prompt("Please enter a number: ", "");
  console.log(input);
  console.log(Number(input));
  console.log(Number.isInteger(Number(input)));
  //Note: Number(null) == 0
  if (input>0 && Number.isInteger(Number(input))) {
    generalCounter++;
    console.log(generalCounter);
    if (input%2==1) {
      oddCounter++;
    } else {
      evenCounter++;
    }
  }
} // var == null catches null and undefined simultaneously

//The prompt() method returns the input value if the user clicks "OK".
// If the user clicks "cancel" the method returns null.


if (input == null) {
  generalCounter = oddCounter = evenCounter = 0;
}

document.getElementById("first").innerHTML = "You entered a total of " + generalCounter + " numbers.";
document.getElementById("second").innerHTML = "You entered " + oddCounter + " odd numbers.";
document.getElementById("third").innerHTML = "You entered " + evenCounter + " even numbers.";
//Other methods to change html content:
//getElementsByClassName('className') -- getElementsByTagName('tagName') for example
