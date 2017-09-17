import java.util.Scanner;

public class PlayMidiAudio {

	
	static String MIDI_FILE = "Wild_Pokemon_Battle_RB.mid";
	static Scanner scanner;
	
	public static void main(String[] args) throws Exception {
		Midi midi = new Midi();
		scanner = new Scanner(System.in);
		String input = "";
		do {
			input = scanner.nextLine().toLowerCase();
			if (input.equals("play") && !midi.isPlaying) {
				midi.PlayMidi(MIDI_FILE);
			}
			else if (input.equals("pause") && midi.isPlaying) {
				midi.StopMidi();
			}
		} while (!input.equals("quit"));
		
	}
	
}