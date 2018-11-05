namespace WindowsFormsAppPostoCombustivel
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            this.label1 = new System.Windows.Forms.Label();
            this.txtDistancia = new System.Windows.Forms.TextBox();
            this.panel1 = new System.Windows.Forms.Panel();
            this.label3 = new System.Windows.Forms.Label();
            this.label2 = new System.Windows.Forms.Label();
            this.txtPreco1 = new System.Windows.Forms.TextBox();
            this.txtConsumo1 = new System.Windows.Forms.TextBox();
            this.radioBtAlcool = new System.Windows.Forms.RadioButton();
            this.panel2 = new System.Windows.Forms.Panel();
            this.label5 = new System.Windows.Forms.Label();
            this.label4 = new System.Windows.Forms.Label();
            this.txtPreco2 = new System.Windows.Forms.TextBox();
            this.txtConsumo2 = new System.Windows.Forms.TextBox();
            this.radioBtGasolina = new System.Windows.Forms.RadioButton();
            this.button1 = new System.Windows.Forms.Button();
            this.txtDespesa = new System.Windows.Forms.TextBox();
            this.label6 = new System.Windows.Forms.Label();
            this.button2 = new System.Windows.Forms.Button();
            this.button3 = new System.Windows.Forms.Button();
            this.panel1.SuspendLayout();
            this.panel2.SuspendLayout();
            this.SuspendLayout();
            // 
            // label1
            // 
            this.label1.AutoSize = true;
            this.label1.Location = new System.Drawing.Point(13, 13);
            this.label1.Name = "label1";
            this.label1.Size = new System.Drawing.Size(75, 13);
            this.label1.TabIndex = 0;
            this.label1.Text = "Distancia (Km)";
            // 
            // txtDistancia
            // 
            this.txtDistancia.Location = new System.Drawing.Point(12, 29);
            this.txtDistancia.Name = "txtDistancia";
            this.txtDistancia.Size = new System.Drawing.Size(100, 20);
            this.txtDistancia.TabIndex = 1;
            this.txtDistancia.TextChanged += new System.EventHandler(this.txtDistancia_TextChanged);
            // 
            // panel1
            // 
            this.panel1.Controls.Add(this.label3);
            this.panel1.Controls.Add(this.label2);
            this.panel1.Controls.Add(this.txtPreco1);
            this.panel1.Controls.Add(this.txtConsumo1);
            this.panel1.Controls.Add(this.radioBtAlcool);
            this.panel1.Location = new System.Drawing.Point(12, 69);
            this.panel1.Name = "panel1";
            this.panel1.Size = new System.Drawing.Size(299, 100);
            this.panel1.TabIndex = 2;
            // 
            // label3
            // 
            this.label3.AutoSize = true;
            this.label3.Location = new System.Drawing.Point(132, 32);
            this.label3.Name = "label3";
            this.label3.Size = new System.Drawing.Size(60, 13);
            this.label3.TabIndex = 6;
            this.label3.Text = "Preço/Litro";
            this.label3.Click += new System.EventHandler(this.label3_Click);
            // 
            // label2
            // 
            this.label2.AutoSize = true;
            this.label2.Location = new System.Drawing.Point(116, 6);
            this.label2.Name = "label2";
            this.label2.Size = new System.Drawing.Size(76, 13);
            this.label2.TabIndex = 6;
            this.label2.Text = "Consumo Km/l";
            this.label2.Click += new System.EventHandler(this.label2_Click);
            // 
            // txtPreco1
            // 
            this.txtPreco1.Location = new System.Drawing.Point(194, 29);
            this.txtPreco1.Name = "txtPreco1";
            this.txtPreco1.Size = new System.Drawing.Size(100, 20);
            this.txtPreco1.TabIndex = 5;
            // 
            // txtConsumo1
            // 
            this.txtConsumo1.Location = new System.Drawing.Point(194, 3);
            this.txtConsumo1.Name = "txtConsumo1";
            this.txtConsumo1.Size = new System.Drawing.Size(100, 20);
            this.txtConsumo1.TabIndex = 5;
            this.txtConsumo1.TextChanged += new System.EventHandler(this.txtConsumo1_TextChanged);
            // 
            // radioBtAlcool
            // 
            this.radioBtAlcool.AutoSize = true;
            this.radioBtAlcool.Location = new System.Drawing.Point(3, 3);
            this.radioBtAlcool.Name = "radioBtAlcool";
            this.radioBtAlcool.Size = new System.Drawing.Size(54, 17);
            this.radioBtAlcool.TabIndex = 0;
            this.radioBtAlcool.TabStop = true;
            this.radioBtAlcool.Text = "Álcool";
            this.radioBtAlcool.UseVisualStyleBackColor = true;
            this.radioBtAlcool.CheckedChanged += new System.EventHandler(this.radioButton1_CheckedChanged);
            // 
            // panel2
            // 
            this.panel2.Controls.Add(this.label5);
            this.panel2.Controls.Add(this.label4);
            this.panel2.Controls.Add(this.txtPreco2);
            this.panel2.Controls.Add(this.txtConsumo2);
            this.panel2.Controls.Add(this.radioBtGasolina);
            this.panel2.Location = new System.Drawing.Point(12, 187);
            this.panel2.Name = "panel2";
            this.panel2.Size = new System.Drawing.Size(299, 100);
            this.panel2.TabIndex = 3;
            // 
            // label5
            // 
            this.label5.AutoSize = true;
            this.label5.Location = new System.Drawing.Point(132, 32);
            this.label5.Name = "label5";
            this.label5.Size = new System.Drawing.Size(60, 13);
            this.label5.TabIndex = 6;
            this.label5.Text = "Preço/Litro";
            // 
            // label4
            // 
            this.label4.AutoSize = true;
            this.label4.Location = new System.Drawing.Point(116, 6);
            this.label4.Name = "label4";
            this.label4.Size = new System.Drawing.Size(76, 13);
            this.label4.TabIndex = 6;
            this.label4.Text = "Consumo Km/l";
            // 
            // txtPreco2
            // 
            this.txtPreco2.Location = new System.Drawing.Point(194, 29);
            this.txtPreco2.Name = "txtPreco2";
            this.txtPreco2.Size = new System.Drawing.Size(100, 20);
            this.txtPreco2.TabIndex = 5;
            // 
            // txtConsumo2
            // 
            this.txtConsumo2.Location = new System.Drawing.Point(194, 3);
            this.txtConsumo2.Name = "txtConsumo2";
            this.txtConsumo2.Size = new System.Drawing.Size(100, 20);
            this.txtConsumo2.TabIndex = 5;
            // 
            // radioBtGasolina
            // 
            this.radioBtGasolina.AutoSize = true;
            this.radioBtGasolina.Location = new System.Drawing.Point(3, 3);
            this.radioBtGasolina.Name = "radioBtGasolina";
            this.radioBtGasolina.Size = new System.Drawing.Size(66, 17);
            this.radioBtGasolina.TabIndex = 0;
            this.radioBtGasolina.TabStop = true;
            this.radioBtGasolina.Text = "Gasolina";
            this.radioBtGasolina.UseVisualStyleBackColor = true;
            this.radioBtGasolina.CheckedChanged += new System.EventHandler(this.radioButton2_CheckedChanged);
            // 
            // button1
            // 
            this.button1.Location = new System.Drawing.Point(12, 373);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(299, 23);
            this.button1.TabIndex = 4;
            this.button1.Text = "Testar e selecionar a melhor escolha";
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // txtDespesa
            // 
            this.txtDespesa.Location = new System.Drawing.Point(12, 330);
            this.txtDespesa.Name = "txtDespesa";
            this.txtDespesa.Size = new System.Drawing.Size(100, 20);
            this.txtDespesa.TabIndex = 1;
            // 
            // label6
            // 
            this.label6.AutoSize = true;
            this.label6.Location = new System.Drawing.Point(13, 314);
            this.label6.Name = "label6";
            this.label6.Size = new System.Drawing.Size(49, 13);
            this.label6.TabIndex = 6;
            this.label6.Text = "Despesa";
            // 
            // button2
            // 
            this.button2.Location = new System.Drawing.Point(12, 443);
            this.button2.Name = "button2";
            this.button2.Size = new System.Drawing.Size(75, 23);
            this.button2.TabIndex = 7;
            this.button2.Text = "Limpar";
            this.button2.UseVisualStyleBackColor = true;
            this.button2.Click += new System.EventHandler(this.button2_Click);
            // 
            // button3
            // 
            this.button3.Location = new System.Drawing.Point(236, 443);
            this.button3.Name = "button3";
            this.button3.Size = new System.Drawing.Size(75, 23);
            this.button3.TabIndex = 7;
            this.button3.Text = "Sair";
            this.button3.UseVisualStyleBackColor = true;
            this.button3.Click += new System.EventHandler(this.button3_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.ClientSize = new System.Drawing.Size(323, 490);
            this.Controls.Add(this.button3);
            this.Controls.Add(this.button2);
            this.Controls.Add(this.label6);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.panel2);
            this.Controls.Add(this.panel1);
            this.Controls.Add(this.txtDespesa);
            this.Controls.Add(this.txtDistancia);
            this.Controls.Add(this.label1);
            this.Name = "Form1";
            this.Text = "AULA_04";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.panel1.ResumeLayout(false);
            this.panel1.PerformLayout();
            this.panel2.ResumeLayout(false);
            this.panel2.PerformLayout();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        #endregion

        private System.Windows.Forms.Label label1;
        private System.Windows.Forms.TextBox txtDistancia;
        private System.Windows.Forms.Panel panel1;
        private System.Windows.Forms.Label label3;
        private System.Windows.Forms.Label label2;
        private System.Windows.Forms.TextBox txtPreco1;
        private System.Windows.Forms.TextBox txtConsumo1;
        private System.Windows.Forms.RadioButton radioBtAlcool;
        private System.Windows.Forms.Panel panel2;
        private System.Windows.Forms.Label label5;
        private System.Windows.Forms.Label label4;
        private System.Windows.Forms.TextBox txtPreco2;
        private System.Windows.Forms.TextBox txtConsumo2;
        private System.Windows.Forms.RadioButton radioBtGasolina;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.TextBox txtDespesa;
        private System.Windows.Forms.Label label6;
        private System.Windows.Forms.Button button2;
        private System.Windows.Forms.Button button3;
    }
}

