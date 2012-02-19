package com.wglxy.example.dash1;

//import android.R;
//import android.R;
import android.app.Activity;
//import android.os.Bundle;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public abstract class DashboardActivity extends Activity 
{
	int randomElement;
	String[] arr_Truth = {	"What is the question that you do not want anyone to ask you in this game?",
	"Describe the sexiest clothes you wore and to impress whom?",
	"Has anyone ever seen you completely naked? If yes, who?",
	"Would you ever cheat on your girlfriend/boyfriend?",
	"What is your wildest sexual fantasy?",
	"Describe your first intimate experience.",
	"What is your bedroom nickname?",
	"If you were the opposite sex for one day, what would you look like and what would you do?",
	"Who has presented you with the worst birthday gift so far?",
	"What is the first physical feature you look for in someone you are attracted to?",
	"Do you still pine for your ex flame?",
	"What is the stupidest thing that you have done in front of a crowd?",
	"Whom would you like to marry from amongst the group in this room and why?",
	"What flaw is enough to cause you to break off a relationship?",
	"Have you had a crush on your best friend?",
	"What is the most daring and crazy thing that you have done in front of a large crowd?",
	"Which is the most sensual pair of clothing you own?",
	"What is the silliest thing that you have said to your partner, while being intimate?",
	"What animal most resembles your personality?",
	"Have you ever kissed someone of the same sex? Who? ",
	"Ask a girl if she were a guy which girl in the room she would date. (do the same to a guy)",
	"Your lover has been magically transformed into an animal, and the only way to restore your lover is to mate with them. Here's the question: Which animal would cause you the least psychological damage?",
	"Have you ever cheated on your bf/gf (if they have one), or would you ever cheat?",
	"Have you ever gone a whole day without wearing underwear? (This question pertains to both bra and panties for women)",
	"If you could be born again would choose to be a different sex to what you are?",
	"If you had 24 hours to live, what would you do, what movie star would you want to kiss, and who would you notify that you are dying",
	"Describe the sexiest clothes you ever wore and why.",
	"When did you stop bathing with your sibling?",
	"Who has the biggest ball you've ever seen? (funny since it can be told literally, but someone will take it sexually. I could be talking about a medicine ball!!!)",
	"If I was a food what would I be and how would you eat me?!?!",
	"Ask a girl/boy what they would do to a girl/boy, of the opposite sex, for a Klondike Bar.",
	"How far have you gone?",
	"How far would you go with someone that you just met?",
	"What is the most embarrassing thing you've done?",
	"Have you ever skinny dipped?",
	"Would you marry your bf/gf?",
	"Do you really love your bf/gf?",
	"Have you ever made an ass of yourself in front of someone you were interested in?",
	"What is the stupidest thing you've done because someone dared you to?",
	"What is the stupidest thing you've done on your own free will?",
	"Tell everyone who you like.",
	"What is the strangest dream you've ever had.Describe in detail.",
	"Ask the victim what question would he most dread to be asked (This way they'll either have to answer it on their next turn or play just plain dare for the rest of their life)",
	"What's your favorite thing about the opposite sex?",
	"What's the worst thing about being your gender?",
	"If you could have anyone here in the room to be your slave, who would it be and what would you make them do?",
	"Rate everyone on a scale of 1-10 What's your idea of a perfect date?",
	"What is your most embarrassing memory?",
	"What was your most perverted dream?",
	"Describe your first sexual experience",
	"Describe your worst sexual encounter",
	"What's your bra size?",
	"How long is your penis?",
	"Who's your strangest crush?",
	"Do you have any crushes now?",
	"If you had to snog one person in the room, who would it be?",
	"Do you have any fetishes?",
	"Do you have any irrational fears?",
	"What's the worst thing you've ever stolen?",
	"Where was the strangest place you've had sex?",
	"Have you ever masturbated anywhere inappropriate? Elaborate...",
	"What's the strangest porn you've ever got off on?",
	"Have you ever had a crush on anyone in the room?",
	"When was the last time you had sex?",
	"Who was your first crush?",
	"Describe your guilty pleasure",
	"What's the best sex you ever had?",
	"Describe your favourite features",
	"Describe your least favourite features",
	"Have you ever had sex/a crush on someone you shouldn't have? Who?"
	};
	
	String[] arr_Dare ={
	"Put an ice cube down your pants until it melts.",
	"Enact a kissing scene using a book.",
	"Go on the balcony and keep shouting 'I love you' to any person who passes by.",
	"Wear your underpants over your pair of trousers and run around the house yelling 'Im the Super Man!'",
	"Peel a banana using your feet.",
	"Smell the feet of everyone in the room and rank them from best to worst.",
	"Get on all four and howl and bark at another player anytime they move or speak for the next 3 rounds.",
	"Take an item of food from the refrigerator and kiss it passionately for 90 seconds",
	"Come up with a cutesy pet name for everyone in the group.",
	"Go into the bathroom and make a toilet paper shirt. You have to wear it for the next two rounds.",
	"Call your crush and tell him in a seductive voice what turns you on.",
	"Select another player and repeat everything they say for the next 3 rounds.",
	"Stick jelly between all your toes and leave it there for 20 minutes.",
	"If your special someone is around, slap him/her and make it hard.",
	"Perform belly dancing standing at the center of the circle.",
	"Dress up like a girl along with makeup (for guys).",
	"Clean the toilet with your toothbrush.",
	"Lick the belly button of the person sitting next to you.",
	"Try to sit on a dog and make him ride you the entire house.",
	"Go to the next door neighbor and ask them to watch you perform 'Im a little teapot!' ",
	"Kiss a given person for a given amount of time (ex. kiss for 2 minutes w/ tongue)",
	"Find something edible in the kitchen for the person to eat that isn't meant to be eaten straight (ketchup, salt, flour, ...)",
	"Have your victim run around outside screaming something totally inane. An example being have I guy go chanting 'I am woman, hear me roar!'",
	"Dare a guy to put on full woman's makeup or let the girls do it.",
	"Go out on your porch and sing the 'I'm a Little Teapot' song.",
	"Get a guy to go out into a public area scratching their crotch and saying, 'Damn these crabs really itch!'",
	"Dare a male player to let all the girl players remove his shoes and socks so they can paint his toes with nail polish. He must remain barefoot until the game is over and hope he hasn't lost his shoes and socks while playing.",
	"Have a person smear jelly in one armpit and peanut butter in the other armpit. Then they must take two slices of bread and wipe it off. Then they have to eat the sandwich!",
	"Eat a piece of food (such as a grape or whip cream) off someone of the opposite gender's tongue.",
	"Push a penny around the toilet seat with your tongue.",
	"Have a guy make-out with a pillow or teddy bear for a certain amount of time, have him say the girls name he likes and make kissing noises.",
	"Have a guy put on a bra stuffed with socks and walk around in it pretending he is a female, his idea of a female!",
	"The person being dared must pick a guy and that guy must do that girls makeup with a blindfold on.",
	"Have a guy kiss every girl, and then tell who has the worst and/or best breath.",
	"Have the 'daree' drink a can or two of their preferred soda pop. Have the game continue, but remind the person to tell everybody when they have to pee. 14.Make that person hold in their piss until they're begging you to let them go to the bathroom."	
};
protected void onCreate(Bundle savedInstanceState) 
{
    super.onCreate(savedInstanceState);
    //setContentView(R.layout.activity_default);

}
    
protected void onDestroy ()
{
   super.onDestroy ();
}

protected void onPause ()
{
   super.onPause ();
}

protected void onRestart ()
{
   super.onRestart ();
}

protected void onResume ()
{
   super.onResume ();
}

protected void onStart ()
{
   super.onStart ();
}

protected void onStop ()
{
   super.onStop ();
}

public void onClickFeature (View v)
{
	final TextView mTextView = (TextView) findViewById(R.id.textView1);

    int id = v.getId ();
    switch (id) {
      case R.id.home_btn_feature3 :
           //startActivity (new Intent(getApplicationContext(), F3Activity.class));
    	   randomElement = (int)(Math.random() * (arr_Truth.length - 1));
			mTextView.setText(arr_Truth[randomElement]);
           break;
      case R.id.home_btn_feature4 :
      	   randomElement = (int)(Math.random() * (arr_Dare.length - 1));
   			mTextView.setText(arr_Dare[randomElement]);

           break;
      default: 
    	   break;
    }
}
public void setTitleFromActivityLabel (int textViewId)
{
    TextView tv = (TextView) findViewById (textViewId);
    if (tv != null) tv.setText (getTitle ());
} // end setTitleText



public void toast (String msg)
{
    Toast.makeText (getApplicationContext(), msg, Toast.LENGTH_SHORT).show ();
} // end toast


public void trace (String msg) 
{
    Log.d("Demo", msg);
    toast (msg);
}

} // end class
