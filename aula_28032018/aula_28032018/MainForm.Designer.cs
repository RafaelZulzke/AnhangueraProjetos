/*
 * Created by SharpDevelop.
 * User: Ronaldo
 * Date: 28/03/2018
 * Time: 19:26
 * 
 * To change this template use Tools | Options | Coding | Edit Standard Headers.
 */
namespace aula_28032018
{
	partial class MainForm
	{
		/// <summary>
		/// Designer variable used to keep track of non-visual components.
		/// </summary>
		private System.ComponentModel.IContainer components = null;
		private System.Windows.Forms.HScrollBar taxa_transf;
		private System.Windows.Forms.TextBox tamanho_arquivo;
		private System.Windows.Forms.Label label1;
		private System.Windows.Forms.ProgressBar progresso;
		private System.Windows.Forms.Label label2;
		private System.Windows.Forms.Label label3;
		private System.Windows.Forms.Label label4;
		private System.Windows.Forms.Label label6;
		private System.Windows.Forms.TextBox tempo_estimado;
		private System.Windows.Forms.TextBox tempo_restante;
		private System.Windows.Forms.Label label8;
		private System.Windows.Forms.Label label9;
		private System.Windows.Forms.Label label10;
		private System.Windows.Forms.Label label11;
		private System.Windows.Forms.Label label12;
		private System.Windows.Forms.Timer timer1;
		private System.Windows.Forms.Button Iniciar;
		private System.Windows.Forms.TextBox textBox1;
		private System.Windows.Forms.TextBox taxa_transferencia;
		private System.Windows.Forms.Label label13;
		private System.Windows.Forms.Label label7;
		private System.Windows.Forms.Button pausar;
		private System.Windows.Forms.Button resetar;
		private System.Windows.Forms.Label label5;
		
		/// <summary>
		/// Disposes resources used by the form.
		/// </summary>
		/// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
		protected override void Dispose(bool disposing)
		{
			if (disposing) {
				if (components != null) {
					components.Dispose();
				}
			}
			base.Dispose(disposing);
		}
		
		/// <summary>
		/// This method is required for Windows Forms designer support.
		/// Do not change the method contents inside the source code editor. The Forms designer might
		/// not be able to load this method if it was changed manually.
		/// </summary>
		private void InitializeComponent()
		{
			this.components = new System.ComponentModel.Container();
			this.tamanho_arquivo = new System.Windows.Forms.TextBox();
			this.label1 = new System.Windows.Forms.Label();
			this.progresso = new System.Windows.Forms.ProgressBar();
			this.label2 = new System.Windows.Forms.Label();
			this.taxa_transf = new System.Windows.Forms.HScrollBar();
			this.label3 = new System.Windows.Forms.Label();
			this.label4 = new System.Windows.Forms.Label();
			this.label6 = new System.Windows.Forms.Label();
			this.tempo_estimado = new System.Windows.Forms.TextBox();
			this.tempo_restante = new System.Windows.Forms.TextBox();
			this.label8 = new System.Windows.Forms.Label();
			this.label9 = new System.Windows.Forms.Label();
			this.label10 = new System.Windows.Forms.Label();
			this.label11 = new System.Windows.Forms.Label();
			this.label12 = new System.Windows.Forms.Label();
			this.timer1 = new System.Windows.Forms.Timer(this.components);
			this.Iniciar = new System.Windows.Forms.Button();
			this.textBox1 = new System.Windows.Forms.TextBox();
			this.taxa_transferencia = new System.Windows.Forms.TextBox();
			this.label13 = new System.Windows.Forms.Label();
			this.label7 = new System.Windows.Forms.Label();
			this.pausar = new System.Windows.Forms.Button();
			this.resetar = new System.Windows.Forms.Button();
			this.label5 = new System.Windows.Forms.Label();
			this.SuspendLayout();
			// 
			// tamanho_arquivo
			// 
			this.tamanho_arquivo.Location = new System.Drawing.Point(128, 46);
			this.tamanho_arquivo.Name = "tamanho_arquivo";
			this.tamanho_arquivo.Size = new System.Drawing.Size(100, 20);
			this.tamanho_arquivo.TabIndex = 0;
			this.tamanho_arquivo.TextChanged += new System.EventHandler(this.Tamanho_arquivoTextChanged);
			// 
			// label1
			// 
			this.label1.Location = new System.Drawing.Point(25, 46);
			this.label1.Name = "label1";
			this.label1.Size = new System.Drawing.Size(80, 33);
			this.label1.TabIndex = 1;
			this.label1.Text = "Tamanho do Arquivo";
			// 
			// progresso
			// 
			this.progresso.Location = new System.Drawing.Point(320, 46);
			this.progresso.Name = "progresso";
			this.progresso.Size = new System.Drawing.Size(100, 23);
			this.progresso.Step = 1;
			this.progresso.TabIndex = 2;
			this.progresso.Click += new System.EventHandler(this.ProgressoClick);
			// 
			// label2
			// 
			this.label2.Location = new System.Drawing.Point(338, 20);
			this.label2.Name = "label2";
			this.label2.Size = new System.Drawing.Size(64, 23);
			this.label2.TabIndex = 3;
			this.label2.Text = "Progresso";
			// 
			// taxa_transf
			// 
			this.taxa_transf.LargeChange = 1;
			this.taxa_transf.Location = new System.Drawing.Point(128, 89);
			this.taxa_transf.Maximum = 10;
			this.taxa_transf.Minimum = 1;
			this.taxa_transf.Name = "taxa_transf";
			this.taxa_transf.Size = new System.Drawing.Size(100, 17);
			this.taxa_transf.TabIndex = 4;
			this.taxa_transf.Value = 1;
			this.taxa_transf.Scroll += new System.Windows.Forms.ScrollEventHandler(this.Taxa_transfScroll);
			// 
			// label3
			// 
			this.label3.Location = new System.Drawing.Point(25, 89);
			this.label3.Name = "label3";
			this.label3.Size = new System.Drawing.Size(100, 34);
			this.label3.TabIndex = 5;
			this.label3.Text = "Taxa de transferência";
			// 
			// label4
			// 
			this.label4.Location = new System.Drawing.Point(128, 106);
			this.label4.Name = "label4";
			this.label4.Size = new System.Drawing.Size(43, 23);
			this.label4.TabIndex = 6;
			this.label4.Text = "0,1";
			// 
			// label6
			// 
			this.label6.Location = new System.Drawing.Point(225, 49);
			this.label6.Name = "label6";
			this.label6.Size = new System.Drawing.Size(43, 20);
			this.label6.TabIndex = 8;
			this.label6.Text = "Mb";
			// 
			// tempo_estimado
			// 
			this.tempo_estimado.Location = new System.Drawing.Point(128, 172);
			this.tempo_estimado.Name = "tempo_estimado";
			this.tempo_estimado.Size = new System.Drawing.Size(100, 20);
			this.tempo_estimado.TabIndex = 9;
			this.tempo_estimado.TextChanged += new System.EventHandler(this.Tempo_estimadoTextChanged);
			// 
			// tempo_restante
			// 
			this.tempo_restante.Location = new System.Drawing.Point(128, 198);
			this.tempo_restante.Name = "tempo_restante";
			this.tempo_restante.Size = new System.Drawing.Size(100, 20);
			this.tempo_restante.TabIndex = 10;
			this.tempo_restante.TextChanged += new System.EventHandler(this.Tempo_restanteTextChanged);
			// 
			// label8
			// 
			this.label8.Location = new System.Drawing.Point(25, 198);
			this.label8.Name = "label8";
			this.label8.Size = new System.Drawing.Size(100, 20);
			this.label8.TabIndex = 12;
			this.label8.Text = "Tempo restante";
			// 
			// label9
			// 
			this.label9.Location = new System.Drawing.Point(225, 175);
			this.label9.Name = "label9";
			this.label9.Size = new System.Drawing.Size(20, 20);
			this.label9.TabIndex = 13;
			this.label9.Text = "s";
			// 
			// label10
			// 
			this.label10.Location = new System.Drawing.Point(225, 201);
			this.label10.Name = "label10";
			this.label10.Size = new System.Drawing.Size(20, 20);
			this.label10.TabIndex = 14;
			this.label10.Text = "s";
			// 
			// label11
			// 
			this.label11.Location = new System.Drawing.Point(320, 72);
			this.label11.Name = "label11";
			this.label11.Size = new System.Drawing.Size(38, 18);
			this.label11.TabIndex = 17;
			this.label11.Text = "0";
			// 
			// label12
			// 
			this.label12.Location = new System.Drawing.Point(390, 72);
			this.label12.Name = "label12";
			this.label12.Size = new System.Drawing.Size(38, 18);
			this.label12.TabIndex = 18;
			this.label12.Text = "100%";
			// 
			// timer1
			// 
			this.timer1.Interval = 1000;
			this.timer1.Tick += new System.EventHandler(this.Timer1Tick);
			// 
			// Iniciar
			// 
			this.Iniciar.BackColor = System.Drawing.Color.LawnGreen;
			this.Iniciar.Location = new System.Drawing.Point(320, 146);
			this.Iniciar.Name = "Iniciar";
			this.Iniciar.Size = new System.Drawing.Size(75, 23);
			this.Iniciar.TabIndex = 19;
			this.Iniciar.Text = "Iniciar";
			this.Iniciar.UseVisualStyleBackColor = false;
			this.Iniciar.Click += new System.EventHandler(this.IniciarClick);
			// 
			// textBox1
			// 
			this.textBox1.Location = new System.Drawing.Point(128, 146);
			this.textBox1.Name = "textBox1";
			this.textBox1.Size = new System.Drawing.Size(100, 20);
			this.textBox1.TabIndex = 20;
			this.textBox1.TextChanged += new System.EventHandler(this.TextBox1TextChanged);
			// 
			// taxa_transferencia
			// 
			this.taxa_transferencia.Location = new System.Drawing.Point(236, 89);
			this.taxa_transferencia.Name = "taxa_transferencia";
			this.taxa_transferencia.Size = new System.Drawing.Size(32, 20);
			this.taxa_transferencia.TabIndex = 21;
			this.taxa_transferencia.TextChanged += new System.EventHandler(this.Taxa_transferenciaTextChanged);
			// 
			// label13
			// 
			this.label13.Location = new System.Drawing.Point(25, 149);
			this.label13.Name = "label13";
			this.label13.Size = new System.Drawing.Size(100, 20);
			this.label13.TabIndex = 22;
			this.label13.Text = "Mb Transferidos";
			// 
			// label7
			// 
			this.label7.Location = new System.Drawing.Point(25, 175);
			this.label7.Name = "label7";
			this.label7.Size = new System.Drawing.Size(100, 23);
			this.label7.TabIndex = 23;
			this.label7.Text = "Tempo estimado";
			// 
			// pausar
			// 
			this.pausar.BackColor = System.Drawing.Color.OrangeRed;
			this.pausar.Location = new System.Drawing.Point(320, 170);
			this.pausar.Name = "pausar";
			this.pausar.Size = new System.Drawing.Size(75, 23);
			this.pausar.TabIndex = 24;
			this.pausar.Text = "Pausar";
			this.pausar.UseVisualStyleBackColor = false;
			this.pausar.Click += new System.EventHandler(this.PausarClick);
			// 
			// resetar
			// 
			this.resetar.Location = new System.Drawing.Point(320, 195);
			this.resetar.Name = "resetar";
			this.resetar.Size = new System.Drawing.Size(75, 23);
			this.resetar.TabIndex = 25;
			this.resetar.Text = "Resetar";
			this.resetar.UseVisualStyleBackColor = true;
			this.resetar.Click += new System.EventHandler(this.ResetarClick);
			// 
			// label5
			// 
			this.label5.Location = new System.Drawing.Point(192, 106);
			this.label5.Name = "label5";
			this.label5.Size = new System.Drawing.Size(38, 23);
			this.label5.TabIndex = 26;
			this.label5.Text = "1mb/s";
			// 
			// MainForm
			// 
			this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
			this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
			this.BackColor = System.Drawing.SystemColors.ActiveCaption;
			this.ClientSize = new System.Drawing.Size(446, 251);
			this.Controls.Add(this.label5);
			this.Controls.Add(this.resetar);
			this.Controls.Add(this.pausar);
			this.Controls.Add(this.label7);
			this.Controls.Add(this.label13);
			this.Controls.Add(this.taxa_transferencia);
			this.Controls.Add(this.textBox1);
			this.Controls.Add(this.Iniciar);
			this.Controls.Add(this.label12);
			this.Controls.Add(this.label11);
			this.Controls.Add(this.label10);
			this.Controls.Add(this.label9);
			this.Controls.Add(this.label8);
			this.Controls.Add(this.tempo_restante);
			this.Controls.Add(this.tempo_estimado);
			this.Controls.Add(this.label6);
			this.Controls.Add(this.label4);
			this.Controls.Add(this.label3);
			this.Controls.Add(this.taxa_transf);
			this.Controls.Add(this.label2);
			this.Controls.Add(this.progresso);
			this.Controls.Add(this.label1);
			this.Controls.Add(this.tamanho_arquivo);
			this.Name = "MainForm";
			this.Text = "aula_28032018";
			this.ResumeLayout(false);
			this.PerformLayout();

		}
	}
}
