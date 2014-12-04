# pretty-formula

A small Java library to parse mathematical formulas to LaTeX and display them as images

```
(a_1 / (b_1 + sqrt(c))^2) + sin(a_2 * b_2)
```

![example](example.svg)

## Installation

Grab the [latest release](/mzur/pretty-formula/releases) and add the `pretty-formula.jar` as well as all the dependencies from the `lib` directory to your project.

## Usage

Pretty-formula provides three functions to parse mathematical formulas either to LaTeX or to bitmap/vector graphics. It provides a basic GUI as an example how to use it as well. This means you even can run `pretty-formula.jar` on its own!

All the following functions are located in the package `de.uni_bielefeld.cebitec.mzurowie.pretty_formula.main`.

### String parseToLatex(String formula)

Parses a mathematical formula String like `(a+b)/c` to valid math LaTeX.

`formula`: A raw formula input String.

**Returns:** The formula parsed to a small subset of LaTeX.

**Throws:** `DetailedParseCancellationException` When the parsing fails.

### BufferedImage parseToImage(String formula)

Parses a mathematical formula String like `(a+b)/c` to a pretty image.

`formula`: A raw formula input String.

**Returns:** An image object containing the rendered formula.

**Throws:** `ParseException` When the formula rendering fails.

**Throws:** `DetailedParseCancellationException` when the formula parsing fails.

### void saveToSVG(String formula, File file)

Parses a mathematical formula like `(a+b)/c` to a pretty image and saves it as an SVG file.

`formula`: A raw formula input String.

`file`: The SVG file to save to.

**Throws:** `ParseException` When parsing the LaTeX formula failed.

**Throws:** `IOException` When writing the file failed.

**Throws:** `DetailedParseCancellationException` When parsing the raw formula to LaTeX failed.

## Example

You can find the fully working GUI example in [`GUIWindow.java`](src/de/uni_bielefeld/cebitec/mzurowie/pretty_formula/main/GUIWindow.java). To run it, simply execute `pretty-formula.jar`.

The important part of parsing the formula to an image and do error handling and user feedback is this:

```java
private void jTextPane1KeyReleased(java.awt.event.KeyEvent evt) {
	// feedback message
   this.jLabel1.setText("");
   
   // clear previously drawn formula
   this.jLabel2.getGraphics().clearRect(0, 0, this.jLabel2.getWidth(), this.jLabel2.getHeight());
   // remove error highlights from user input
   this.jTextPane1.getHighlighter().removeAllHighlights();

   try {
   	// parse the image
      BufferedImage image = FormulaParser.parseToImage(this.jTextPane1.getText());
      // display the image
      this.jLabel2.getGraphics().drawImage(image, 0, 0, null);
      
   } catch (DetailedParseCancellationException e) {
     // display user feedback on erroneous input
     this.handleDetailedParseCancellationException(e);
   } catch (ParseException e) {
   	// display user feedback on erroneous parsing (shouldn't happen, though)
      this.jLabel1.setText(e.getMessage());
   }
}

private void handleDetailedParseCancellationException(DetailedParseCancellationException e) {
   try {
      // highlight the position at which the error occurred
      this.jTextPane1.getHighlighter().addHighlight(
              e.getCharPositionInLine(), e.getEndCharPositionInLine(),
              this.errorHighlighter);
   } catch (BadLocationException ex) {
      // simply don't highlight
   }

   // display the error message in addition to the error highlighting
   this.jLabel1.setText(e.getMessage());
}
```