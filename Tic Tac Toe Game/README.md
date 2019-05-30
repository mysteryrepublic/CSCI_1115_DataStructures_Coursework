/*
Java-Tic-Tac-Toe-Game

Synopsis:

A two player classic Tic Tac Toe game. Where one player is 'X' and the other is 'O'. Each player takes turns
placing their token until one get three in a row or the game board is completely filled.

Motivation:

This was done as a demonstration of client/server computing of rht epurp-ose of a final project for a class. The
program uses JavaFx.

How to play:

To play, first launch the TicTacToeServer.java file and then launch the TicTacToeClient.java file twince (this is so
both players are connected and game play on their ownn game board). 
[Exmaple image of the game board](gameBoard_example.png)
Each player takes turns placing their tokens
on the board. Players will know it is their turn by the text at the bottom of the window.
[play exmaple](play_exmaple.png)
If at any time the players which to exit the game they may press the Exit button found in the lower right corner
of the window and it will take them out of the window.

Code Example:

 The code snippet below is how the program creates the server socket and the session for the two players
 
 '''
 


	 new Thread ( () -> { 
		try {
			//create a server socket
			ServerSocket serverSocket = new ServerSocket(8000);
			Platform.runLater(() -> taLog.appendText(new Date() + ": Server started at socket 8000\n"));
			//ready to create a session for every two players
			while (true)	{
				Platform.runLater(() -> taLog.appendText(new Date() + ": Wait for players to join session " 					+ sessionNo + '\n'));
				//connect player 1
				Socket player1 = serverSocket.accept();
				Platform.runLater(() -> {
				taLog.appendText(new Date() + ": Player 1 joined the session " + sessionNo + '\n');
				taLog.appendText("Player 1's IP address" + player1.getInetAddress().getHostAddress() + 						'\n');
			});
			//notify that the player is player 1
			new DataOutputStream(player1.getOutputStream()).writeInt(Player1);
			//connect player 2
			Socket player2 = serverSocket.accept();
			Platform.runLater(() -> {
				taLog.appendText(new Date() + ": Player 2 joined the session " + sessionNo + '\n');
				taLog.appendText("Plater 2's IP address" + player1.getInetAddress().getHostAddress() + 						'\n');
			});
			//notify that the player is play 2
			new DataOutputStream(player2.getOutputStream()).writeInt(Player2);
			//display this session and increment session number
			Platform.runLater(() -> 
				taLog.appendText(new Date() + ": Start a thread for session " + sessionNo++ + '\n'));
			//launch a new thread for this session of two players
			new Thread (new HandleASession(player1, player2)).start();
			}
		}
		catch(IOException ex) {
			ex.printStackTrace();
		}
	}).start();
    '''








*/
