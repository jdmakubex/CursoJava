import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;

/*
Este es un programpa para visualizar imagenes
 */
public class ImageViewer 
{
	public static void main (String[] args)
	{
		JFrame frame = new ImageViewerFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.show();
	}
}

/*
Un marco con una etiqueta para mostrar una imagen
 */
class ImageViewerFrame extends JFrame
{
	public ImageViewerFrame()
	{
		setTitle("ImageViewer");
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGTH);

		//Se usa una etiqueta para mostrar una imagen
		label = new JLabel();
		Container contentPane = getContentPane();
		contentPane.add(label);

		//Configutra el contenedor de ficheros
		chooser = new JFileChooser();
		chooser.setCurrentDirectory(new File ("."));

		//Configura la barra de menús
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);

		JMenu menu = new  JMenu ("File");
		menuBar.add(menu);

		JMenuItem openItem = new JMenuItem("Open");
		menu.add(openItem);
		openItem.addActionListener(new
			ActionListener()
			{
				public void  actionPerformed(ActionEvent evt)
				{
					//Muestra el cuadro de dialogo del selector de ficheros
					int r = chooser.showOpenDialog(null);

					//Si ha seleccionado un fichero, lo establece como icono de la etiqueta
					if (r == JFileChooser.APPROVE_OPTION)
					{
						String name = chooser.getSelectedFile().getPath();
						label.setIcon(new ImageIcon(name));
					}
				}

			});
		JMenuItem exitItem = new JMenuItem("Exit");
		menu.add(exitItem);
		exitItem.addActionListener(new
		 ActionListener()
		 {
		 	public void actionPerformed(ActionEvent event)
		 	{
		 		System.exit(0);
		 	}
		 });
	}

	private JLabel label;
	private JFileChooser chooser;
	private static final int DEFAULT_WIDTH = 300;
	private static final int DEFAULT_HEIGTH = 400;
}