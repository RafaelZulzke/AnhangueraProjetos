/*
 * Created by SharpDevelop.
 * User: frc.1581104850
 * Date: 28/03/2018
 * Time: 19:32
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
using System;
using System.Collections.Generic;
using System.Drawing;
using System.Windows.Forms;

namespace ex3
{
	/// <summary>
	/// Description of MainForm.
	/// </summary>
	public partial class MainForm : Form
	{
		public MainForm()
		{
			//
			// The InitializeComponent() call is required for Windows Forms designer support.
			//
			InitializeComponent();
			
			//
			// TODO: Add constructor code after the InitializeComponent() call.
			//
		}
		
		void Button1Click(object sender, EventArgs e)
		{
	
		}
		
		void HScrollBar1Scroll(object sender, ScrollEventArgs e)
		{

		}
		
		void VScrollBar1Scroll(object sender, ScrollEventArgs e)
		{
			vScrollBar1.Dock = DockStyle.Right;
			Controls.Add(vScrollBar1);
		}
		
		void ProgressBar1Click(object sender, EventArgs e)
		{
		
		}
		
		void Button2Click(object sender, EventArgs e)
		{
		 progressBar1.Value = progressBar1.Value + 1;
		 if(progressBar1.Value == 100)
		 {
		 	Application.Exit();
		 }
		}
		
		void Button3Click(object sender, EventArgs e)
		{
		 progressBar1.Value = progressBar1.Value - 1;
		 if(progressBar1.Value < 0)
		 {
		 	MessageBox.Show("Não há como decrementar");
		 }
		}
		
		void Timer1Tick(object sender, EventArgs e)
		{
			
		}
		
		void Button4Click(object sender, EventArgs e)
		{
			timer1.Enabled = true;
		}
		
		void Button5Click(object sender, EventArgs e)
		{
			timer1.Enabled = false;
		}
		
		void TextBox1TextChanged(object sender, EventArgs e)
		{
			if(timer1.Enabled = true)
			{
				textBox1.Text = "Contagem Começou";
			}
			else
			{
			    textBox1.Text = "Contagem Parou";
			}
		}
		
	}
}
