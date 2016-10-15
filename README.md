# logicPuzzle
A program used to help solve Einstein's logic puzzle, as seen at https://www.youtube.com/watch?v=1rDVz_Fb6HQ

Creates a grid used for solving the logic puzzle mentioned above. Users may click a spot on the grid to mark it as false (red), possibly true (yellow), and definitely true (green). Marking a spot as definitely true automatically marks all other spots in the same row/column as false.

For example, if we determine that the third house has blue walls, then (due to the nature of these types of logic puzzles) that means houses 1, 2, 4, and 5 can *not* have blue walls. Likewise, the third house cannnot have red, yellow, green, or white walls. Marking the spot indicating that house three has blue walls would mark all the other colors for the third house (the same column) as false, as well as all the other houses having blue walls (the same row).

Program has an Undo and Redo feature in case of mistakes.

The "Default" button implements all the given clues, but only at the bare minimum. For example, one clue states:

	"The Norwegian lives in the first house."

As such, the spot for Norwegian-First House is marked true. A second clue is:

	"The Norwegian lives next to the blue house."

Since the Norwegian cannot live in the blue house if he lives next to it, the spot for Norwegian-Blue is marked false.
Putting these clues together, we can infer that the first house does not have blue walls. This spot, however, has remained unchanged. The program is designed to make solving the puzzle as painless as possible, but it's still the user's job to actually solve it.
Any clues that the user can still glean information from show up in a popup window.

Future plans involve replacing the "Default" button with a "Load" button, as well as adding a "Save" button so that the user may save their current progress.

Far future plans involve adjustable grid sizes for use with other logic puzzles. It is currently unknown if this goal will be reached.
