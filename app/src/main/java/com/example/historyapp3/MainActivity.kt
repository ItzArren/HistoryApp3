package com.example.historyapp3

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

annotation class suppressLint(val value: String)

class MainActivity : AppCompatActivity() {

    ///declare
    private lateinit var checkButton: Button
    private lateinit var editText: EditText
    private lateinit var clearButton: Button
    private lateinit var TextView: TextView

    @SuppressLint("SetTextI18n")
    @suppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //initialise
        checkButton = findViewById(R.id.checkButton)
        clearButton = findViewById(R.id.clearButton2)
        editText = findViewById(R.id.editText)
        TextView = findViewById(R.id.textView)

        checkButton.setOnClickListener {
            //create a variable of an age to get the age value from the user
            val age = editText.text.toString().toIntOrNull()
            var response = ""

            if (age != null) {
                if (age in 20..100) {
                    when (age) {
                        82-> response = "Pele,Considered by many to be the best football player of all time, Pelé has had an unmatched influence on the game. With more than 1,000 goals in his career, the legendary Brazilian won three FIFA World Cups. Pelé was special because of his rare combination of talent, athleticism, and goal-scoring prowess. He had an incredible talent because of his dribbling, quickness, and precision finishing."
                        60-> response = "Diego Maradona, an Argentine genius, is renowned for his exceptional talent and capacity to impact games on his own. In the 1986 World Cup, he guided Argentina to victory, showcasing his unparalleled brilliance with the Hand of God goal and the Goal of the Century. Maradona had superb ball control up close, superb dribbling, and a natural sense of how to read the game."
                        68-> response = "John Cruyff,The Dutch icon Cruyff played a key role in the development of Total Football, a method of play that completely changed the game. Cruyff was well-known for his refined technique, elegance, and tactical acumen. He also had remarkable vision and dribbling skills. In addition to leading the Netherlands to the 1974 World Cup final, he was a major contributor to Ajax's supremacy in the 1970s."
                        88-> response = "Alfredo Di Stefano, a Spanish forward of Argentine descent, played a significant role in Real Madrid's dominance of European football in the 1950s and 1960s. He was a total player, contributing to the playmaking, goal scoring, and defence in all facets of the game. Real Madrid's five consecutive European Cup titles were largely attributed to Di Stefano's adaptability, wit, and leadership."
                        78-> response = "Franz Beckenbauer,German great Beckenbauer transformed the function of the contemporary libero or sweeper. Known as \"Der Kaiser,\" he was able to blend skillful ball play with a strong defensive game. Unmatched were Beckenbauer's vision, poise, and ability to control the game from a distance. He became a German football star after winning the World Cup both as a player and a coach."
                        71-> response = "Eusébio,Portuguese forward Eusébio was a standout player for Benfica and the Portuguese national team. He scored goals frequently. His striking prowess, pace, and ability to score goals made him one of the most dangerous strikers of all time. Eusébio's achievements at the 1966 World Cup, where he took home the Golden Boot, solidified his standing as one of the best players in the game."
                        57-> response = "Roberto Baggio,Italian forward Baggio was a lovely player with amazing skill and exquisite technique. He played for the Italian national team and for a number of elite teams, such as AC Milan and Juventus. Baggio was dubbed \"Il Divin Codino\" (The Divine Ponytail) for his inventiveness, dribbling skills, and accurate shooting."
                        25-> response = "Tommy Blackstock,Scottish football player Thomas Blackstock was a defender. He played for Blue Bell, Raith Rovers, Leith Athletic, Cowdenbeath, Manchester United, Dunniker Rangers, and Cowdenbeath. He was born in Kirkcaldy. He suffered a head injury and collapsed while heading the ball on April 8, 1907, while playing for Manchester United against St. Helens."
                        58-> response = "George Best,heyday was agonisingly short. In 1968, a week after turning twenty-two, the winger with the body feint that could turn opponents into twisted blood guided Manchester United to their first European Cup, netting his 32nd goal of the year in the final against Benfica. Once he was 26, he never scored more than ten goals for a European team."
                        86-> response = "Bobby Charlton,The legendary Manchester United player, one of just four Englishmen to have won the coveted Ballon d'Or, accepted the award in 1966 following his contribution to England's World Cup victory the previous year. Before Wayne Rooney surpassed Charlton's record of 249 goals, Charlton was Man United's best goalscorer. With players like Wayne Rooney, David Beckham, and Paul Gascoigne included in England's three greatest XIs ever, Charlton is so famous for both his former club and his country that it is clear just how much of an impact he had off the pitch. In 2023, he tragically went away, leaving behind a remarkable legacy."


                    }
                }


                //when age is 82 years display Pele else when .. and so on


                TextView.text = if (response != "") {
                    "This age matches historical figure $response"


                } else {
                    "There are no historical figures with the entered age"
                }
            } else {
                TextView.text = "The input is invalid. Please give a valid age between 20 and 100."
            }
        }
        clearButton.setOnClickListener {
            editText.text.clear()
            TextView.text = ""

        }
    }
}
