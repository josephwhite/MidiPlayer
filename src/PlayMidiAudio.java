import java.util.Scanner;

import javax.swing.JOptionPane;

public class PlayMidiAudio {

	static String MIDI_FILE = "Wild_Pokemon_Battle_RB.mid";
	static Scanner scanner;

	public static void main(String[] args) throws Exception {

		Midi midi = new Midi();
		scanner = new Scanner(System.in);
		String input = "";

		do {
			input = scanner.next().toLowerCase();
			if (input.equals("play") && !midi.isPlaying) {
				midi.PlayMidi(MIDI_FILE);
			}
			else if (input.equals("pause") && midi.isPlaying) {
				midi.PauseMidi();
			}
			else if (input.equals("current tempo")) {
				JOptionPane.showMessageDialog(null, "The current tempo is " + midi.getTempo());
			}
			else if (input.equals("tempo")) {
				int numberInput = scanner.nextInt();
				midi.setTempo(numberInput);
			}
		} while (!input.equals("quit"));
	}
}