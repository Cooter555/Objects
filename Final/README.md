# Final

## Synopsis
This final project is an alarm that you have to play in order for it to stop.

## Motivation
I made this because I am literally the worst person when it comes to getting out of bed in the morning. I am hoping this will help in the future.

## How to Run
All you need to do is download all of the files and make sure they are in the same folder. If the mp3 files are not in the same folder as the java file it will not work.

## Code Example
Here is a section of code that I am proud of because I find it quite funny.

r.setOnMouseClicked(e -> {
			if (e.getButton() == MouseButton.PRIMARY) {
				mp2.play();
				//mp2 will laugh at the user because either they took too long and that was funny or they got it first try because they were so mad and that is funny.
				
				pt.pause();
				//This stops the circle's movement.
				
				mp.pause();
				mp1.pause();
				//These two stop the terrible audio tracks. 
				
				System.exit(0);
				//System.exit(0); stops the program, thus saving the user from the nightmare that is this alarm.
			}
		});

## Tests
As far as testing I mostly used just typical debugging technique such as commenting out certain code, altering existing code, etc. JUnit4 was also used.

## Contributors
As far as uptades go don't expect any.
People who have contributed are, Rockey Mazorow, Jacob Almedia, Austin Smith, and Dylan Bartlett. Each of these wonderful people have helped tremendously by fixing errors.
