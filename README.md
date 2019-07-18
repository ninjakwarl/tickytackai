# TickyTac AI
unbeatable tic tac toe game - based on Java using NegaMax Algorithm 👀❌⭕️

This algorithm relies on the fact that ![](https://wikimedia.org/api/rest_v1/media/math/render/svg/e64fb74b232e7412ce1967d786e07fd56b08296f)
to simplify the implementation of the minimax algorithm. More precisely, the value of a position to player A 
in such a game is the negation of the value to player B. Thus, the player on move looks for a move that maximizes 
the negation of the value resulting from the move: this successor position must by definition have been valued by the opponent. 
The reasoning of the previous sentence works regardless of whether A or B is on move. This means that a single procedure can be 
used to value both positions. This is a coding simplification over minimax, which requires that A selects the move with the maximum-valued successor while B selects the move with the minimum-valued successor. 
The difficulty of using the Minimax algorithm is that two kinds of heuristics must be defined for a game. 

It's easy to see that there is a strong relation between the two heuristics. This connection can be described with simple words, 
as follows: the better a state of the game is for one player, the worse it is for the other player. 
So, the heuristics for one player can be simply the opposite (negated) of the heuristics for the other player.

In Karl by layman's term: Just imagine you are being negated everytime you move with every possible movements 😆

Here is the sample setup :poop:

![](https://media.giphy.com/media/Tf3Qy3PFAWebrLnUKn/giphy.gif)

Please support 
my blog!
http://iamkarlsaycon.com/blog/dotword/

Share your ideas for the Java Developers out there who loves to do Machine Learning or into Data Science. 🤘
