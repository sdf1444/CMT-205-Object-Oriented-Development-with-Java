package application;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.*;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.*;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class StudInfoController implements Initializable {
	
	//FXML elements.
    @FXML
    private Tab profile;
    @FXML
    private Label namelbl;
    @FXML
    private Label clslbl;
    @FXML
    private Label divlbl;
    @FXML
    private Label rnolbl;
    @FXML
    private Label maillbl;
    @FXML
    private Label moblbl;
    @FXML
    private Label altlbl;
    @FXML
    private Tab aht;
    @FXML
    private Tab anto;
    @FXML
    private Tab ba;
    @FXML
    private Tab bats;
    @FXML
    private Tab cch;
    @FXML
    private Tab ccl;
    @FXML
    private Tab cna;
    @FXML
    private Tab cpg;
    @FXML
    private Tab expn;
    @FXML
    private Tab ezj;
    @FXML
    private Tab gkn;
    @FXML
    private Tab mdc;
    @FXML
    private Tab pfg;
    @FXML
    private Tab ppb;
    @FXML
    private Tab pru;
    @FXML
    private Tab psn;
    @FXML
    private Tab rb;
    @FXML
    private Tab rdsa;
    @FXML
    private Tab rr;
    @FXML
    private Tab sdr;
    @FXML
    private Tab shp;
    @FXML
    private Tab sky;
    @FXML
    private Tab sse;
    @FXML
    private Tab stj;
    @FXML
    private Tab tsco;
    @FXML
    private Tab tui;
    @FXML
    private Tab vod;
    @FXML
    private Tab wpg;
    @FXML
    private TableView<AHT> AHT;
    @FXML
    private TableView<ANTO> ANTO;
    @FXML
    private TableView<BA> BA;
    @FXML
    private TableView<BATS> BATS;
    @FXML
    private TableView<CCH> CCH;
    @FXML
    private TableView<CCL> CCL;
    @FXML
    private TableView<CNA> CNA;
    @FXML
    private TableView<CPG> CPG;
    @FXML
    private TableView<EXPN> EXPN;
    @FXML
    private TableView<EZJ> EZJ;
    @FXML
    private TableView<GKN> GKN;
    @FXML
    private TableView<MDC> MDC;
    @FXML
    private TableView<PFG> PFG;
    @FXML
    private TableView<PPB> PPB;
    @FXML
    private TableView<PRU> PRU;
    @FXML
    private TableView<PSN> PSN;
    @FXML
    private TableView<RB> RB;
    @FXML
    private TableView<RDSA> RDSA;
    @FXML
    private TableView<RR> RR;
    @FXML
    private TableView<SDR> SDR;
    @FXML
    private TableView<SHP> SHP;
    @FXML
    private TableView<SKY> SKY;
    @FXML
    private TableView<SSE> SSE;
    @FXML
    private TableView<STJ> STJ;
    @FXML
    private TableView<TSCO> TSCO;
    @FXML
    private TableView<TUI> TUI;
    @FXML
    private TableView<VOD> VOD;
    @FXML
    private TableView<WPG> WPG;
    @FXML
    private TableColumn<AHT, String> date;
    @FXML
    private TableColumn<AHT, String> open;
    @FXML
    private TableColumn<AHT, String> high;
    @FXML
    private TableColumn<AHT, String> low;
    @FXML
    private TableColumn<AHT, String> close;
    @FXML
    private TableColumn<AHT, String> volume;
    @FXML
    private TableColumn<AHT, String> adjclose;
    @FXML
    private TableColumn<ANTO, String> date2;
    @FXML
    private TableColumn<ANTO, String> open2;
    @FXML
    private TableColumn<ANTO, String> high2;
    @FXML
    private TableColumn<ANTO, String> low2;
    @FXML
    private TableColumn<ANTO, String> close2;
    @FXML
    private TableColumn<ANTO, String> volume2;
    @FXML
    private TableColumn<ANTO, String> adjclose2;
    @FXML
    private TableColumn<BA, String> date3;
    @FXML
    private TableColumn<BA, String> open3;
    @FXML
    private TableColumn<BA, String> high3;
    @FXML
    private TableColumn<BA, String> low3;
    @FXML
    private TableColumn<BA, String> close3;
    @FXML
    private TableColumn<BA, String> volume3;
    @FXML
    private TableColumn<BA, String> adjclose3;
    @FXML
    private TableColumn<BATS, String> date4;
    @FXML
    private TableColumn<BATS, String> open4;
    @FXML
    private TableColumn<BATS, String> high4;
    @FXML
    private TableColumn<BATS, String> low4;
    @FXML
    private TableColumn<BATS, String> close4;
    @FXML
    private TableColumn<BATS, String> volume4;
    @FXML
    private TableColumn<BATS, String> adjclose4;
    @FXML
    private TableColumn<CCH, String> date5;
    @FXML
    private TableColumn<CCH, String> open5;
    @FXML
    private TableColumn<CCH, String> high5;
    @FXML
    private TableColumn<CCH, String> low5;
    @FXML
    private TableColumn<CCH, String> close5;
    @FXML
    private TableColumn<CCH, String> volume5;
    @FXML
    private TableColumn<CCH, String> adjclose5;
    @FXML
    private TableColumn<CCL, String> date6;
    @FXML
    private TableColumn<CCL, String> open6;
    @FXML
    private TableColumn<CCL, String> high6;
    @FXML
    private TableColumn<CCL, String> low6;
    @FXML
    private TableColumn<CCL, String> close6;
    @FXML
    private TableColumn<CCL, String> volume6;
    @FXML
    private TableColumn<CCL, String> adjclose6;
    @FXML
    private TableColumn<CNA, String> date7;
    @FXML
    private TableColumn<CNA, String> open7;
    @FXML
    private TableColumn<CNA, String> high7;
    @FXML
    private TableColumn<CNA, String> low7;
    @FXML
    private TableColumn<CNA, String> close7;
    @FXML
    private TableColumn<CNA, String> volume7;
    @FXML
    private TableColumn<CNA, String> adjclose7;
    @FXML
    private TableColumn<CPG, String> date8;
    @FXML
    private TableColumn<CPG, String> open8;
    @FXML
    private TableColumn<CPG, String> high8;
    @FXML
    private TableColumn<CPG, String> low8;
    @FXML
    private TableColumn<CPG, String> close8;
    @FXML
    private TableColumn<CPG, String> volume8;
    @FXML
    private TableColumn<CPG, String> adjclose8;
    @FXML
    private TableColumn<EXPN, String> date9;
    @FXML
    private TableColumn<EXPN, String> open9;
    @FXML
    private TableColumn<EXPN, String> high9;
    @FXML
    private TableColumn<EXPN, String> low9;
    @FXML
    private TableColumn<EXPN, String> close9;
    @FXML
    private TableColumn<EXPN, String> volume9;
    @FXML
    private TableColumn<EXPN, String> adjclose9;
    @FXML
    private TableColumn<EZJ, String> date10;
    @FXML
    private TableColumn<EZJ, String> open10;
    @FXML
    private TableColumn<EZJ, String> high10;
    @FXML
    private TableColumn<EZJ, String> low10;
    @FXML
    private TableColumn<EZJ, String> close10;
    @FXML
    private TableColumn<EZJ, String> volume10;
    @FXML
    private TableColumn<EZJ, String> adjclose10;
    @FXML
    private TableColumn<GKN, String> date11;
    @FXML
    private TableColumn<GKN, String> open11;
    @FXML
    private TableColumn<GKN, String> high11;
    @FXML
    private TableColumn<GKN, String> low11;
    @FXML
    private TableColumn<GKN, String> close11;
    @FXML
    private TableColumn<GKN, String> volume11;
    @FXML
    private TableColumn<GKN, String> adjclose11;
    @FXML
    private TableColumn<MDC, String> date12;
    @FXML
    private TableColumn<MDC, String> open12;
    @FXML
    private TableColumn<MDC, String> high12;
    @FXML
    private TableColumn<MDC, String> low12;
    @FXML
    private TableColumn<MDC, String> close12;
    @FXML
    private TableColumn<MDC, String> volume12;
    @FXML
    private TableColumn<MDC, String> adjclose12;
    @FXML
    private TableColumn<PFG, String> date13;
    @FXML
    private TableColumn<PFG, String> open13;
    @FXML
    private TableColumn<PFG, String> high13;
    @FXML
    private TableColumn<PFG, String> low13;
    @FXML
    private TableColumn<PFG, String> close13;
    @FXML
    private TableColumn<PFG, String> volume13;
    @FXML
    private TableColumn<PFG, String> adjclose13;
    @FXML
    private TableColumn<PPB, String> date14;
    @FXML
    private TableColumn<PPB, String> open14;
    @FXML
    private TableColumn<PPB, String> high14;
    @FXML
    private TableColumn<PPB, String> low14;
    @FXML
    private TableColumn<PPB, String> close14;
    @FXML
    private TableColumn<PPB, String> volume14;
    @FXML
    private TableColumn<PPB, String> adjclose14;
    @FXML
    private TableColumn<PRU, String> date15;
    @FXML
    private TableColumn<PRU, String> open15;
    @FXML
    private TableColumn<PRU, String> high15;
    @FXML
    private TableColumn<PRU, String> low15;
    @FXML
    private TableColumn<PRU, String> close15;
    @FXML
    private TableColumn<PRU, String> volume15;
    @FXML
    private TableColumn<PRU, String> adjclose15;
    @FXML
    private TableColumn<PSN, String> date16;
    @FXML
    private TableColumn<PSN, String> open16;
    @FXML
    private TableColumn<PSN, String> high16;
    @FXML
    private TableColumn<PSN, String> low16;
    @FXML
    private TableColumn<PSN, String> close16;
    @FXML
    private TableColumn<PSN, String> volume16;
    @FXML
    private TableColumn<PSN, String> adjclose16;    
    @FXML
    private TableColumn<RB, String> date17;
    @FXML
    private TableColumn<RB, String> open17;
    @FXML
    private TableColumn<RB, String> high17;
    @FXML
    private TableColumn<RB, String> low17;
    @FXML
    private TableColumn<RB, String> close17;
    @FXML
    private TableColumn<RB, String> volume17;
    @FXML
    private TableColumn<RB, String> adjclose17;
    @FXML
    private TableColumn<RDSA, String> date18;
    @FXML
    private TableColumn<RDSA, String> open18;
    @FXML
    private TableColumn<RDSA, String> high18;
    @FXML
    private TableColumn<RDSA, String> low18;
    @FXML
    private TableColumn<RDSA, String> close18;
    @FXML
    private TableColumn<RDSA, String> volume18;
    @FXML
    private TableColumn<RDSA, String> adjclose18;
    @FXML
    private TableColumn<RR, String> date19;
    @FXML
    private TableColumn<RR, String> open19;
    @FXML
    private TableColumn<RR, String> high19;
    @FXML
    private TableColumn<RR, String> low19;
    @FXML
    private TableColumn<RR, String> close19;
    @FXML
    private TableColumn<RR, String> volume19;
    @FXML
    private TableColumn<RR, String> adjclose19;
    @FXML
    private TableColumn<SDR, String> date20;
    @FXML
    private TableColumn<SDR, String> open20;
    @FXML
    private TableColumn<SDR, String> high20;
    @FXML
    private TableColumn<SDR, String> low20;
    @FXML
    private TableColumn<SDR, String> close20;
    @FXML
    private TableColumn<SDR, String> volume20;
    @FXML
    private TableColumn<SDR, String> adjclose20;
    @FXML
    private TableColumn<SHP, String> date21;
    @FXML
    private TableColumn<SHP, String> open21;
    @FXML
    private TableColumn<SHP, String> high21;
    @FXML
    private TableColumn<SHP, String> low21;
    @FXML
    private TableColumn<SHP, String> close21;
    @FXML
    private TableColumn<SHP, String> volume21;
    @FXML
    private TableColumn<SHP, String> adjclose21;
    @FXML
    private TableColumn<SKY, String> date22;
    @FXML
    private TableColumn<SKY, String> open22;
    @FXML
    private TableColumn<SKY, String> high22;
    @FXML
    private TableColumn<SKY, String> low22;
    @FXML
    private TableColumn<SKY, String> close22;
    @FXML
    private TableColumn<SKY, String> volume22;
    @FXML
    private TableColumn<SKY, String> adjclose22;
    @FXML
    private TableColumn<SSE, String> date23;
    @FXML
    private TableColumn<SSE, String> open23;
    @FXML
    private TableColumn<SSE, String> high23;
    @FXML
    private TableColumn<SSE, String> low23;
    @FXML
    private TableColumn<SSE, String> close23;
    @FXML
    private TableColumn<SSE, String> volume23;
    @FXML
    private TableColumn<SSE, String> adjclose23;
    @FXML
    private TableColumn<STJ, String> date24;
    @FXML
    private TableColumn<STJ, String> open24;
    @FXML
    private TableColumn<STJ, String> high24;
    @FXML
    private TableColumn<STJ, String> low24;
    @FXML
    private TableColumn<STJ, String> close24;
    @FXML
    private TableColumn<STJ, String> volume24;
    @FXML
    private TableColumn<STJ, String> adjclose24;
    @FXML
    private TableColumn<TSCO, String> date25;
    @FXML
    private TableColumn<TSCO, String> open25;
    @FXML
    private TableColumn<TSCO, String> high25;
    @FXML
    private TableColumn<TSCO, String> low25;
    @FXML
    private TableColumn<TSCO, String> close25;
    @FXML
    private TableColumn<TSCO, String> volume25;
    @FXML
    private TableColumn<TSCO, String> adjclose25;
    @FXML
    private TableColumn<TUI, String> date26;
    @FXML
    private TableColumn<TUI, String> open26;
    @FXML
    private TableColumn<TUI, String> high26;
    @FXML
    private TableColumn<TUI, String> low26;
    @FXML
    private TableColumn<TUI, String> close26;
    @FXML
    private TableColumn<TUI, String> volume26;
    @FXML
    private TableColumn<TUI, String> adjclose26;
    @FXML
    private TableColumn<VOD, String> date27;
    @FXML
    private TableColumn<VOD, String> open27;
    @FXML
    private TableColumn<VOD, String> high27;
    @FXML
    private TableColumn<VOD, String> low27;
    @FXML
    private TableColumn<VOD, String> close27;
    @FXML
    private TableColumn<VOD, String> volume27;
    @FXML
    private TableColumn<VOD, String> adjclose27;
    @FXML
    private TableColumn<WPG, String> date28;
    @FXML
    private TableColumn<WPG, String> open28;
    @FXML
    private TableColumn<WPG, String> high28;
    @FXML
    private TableColumn<WPG, String> low28;
    @FXML
    private TableColumn<WPG, String> close28;
    @FXML
    private TableColumn<WPG, String> volume28;
    @FXML
    private TableColumn<WPG, String> adjclose28;
    
    //FX collections for observable list.
    //Adapted from oracle documentation website.
    //Accessed 30/03/19.
    //https://docs.oracle.com/javase/8/javafx/api/javafx/collections/FXCollections.html
    ObservableList<Stockviewer> list=FXCollections.observableArrayList(); 
	    @FXML
	    private TableView<Stockviewer> stockview;
	    @FXML
	    private TableColumn<Stockviewer, String> stocksymbol;
	    @FXML
	    private TableColumn<Stockviewer, String> companyname;
	    @FXML
	    private TableColumn<Stockviewer, String> latestshareprice;
    //End of reference.
	    
    @FXML
    LineChart<String, Number> chart1;
    @FXML
    LineChart<String, Number> chart2;
    @FXML
    LineChart<String, Number> chart3;
    @FXML
    LineChart<String, Number> chart4;
    @FXML
    LineChart<String, Number> chart5;
    @FXML
    LineChart<String, Number> chart6;
    @FXML
    LineChart<String, Number> chart7;
    @FXML
    LineChart<String, Number> chart8;    
    @FXML
    LineChart<String, Number> chart9;
    @FXML
    LineChart<String, Number> chart10;
    @FXML
    LineChart<String, Number> chart11;
    @FXML
    LineChart<String, Number> chart12;   
    @FXML
    LineChart<String, Number> chart13;
    @FXML
    LineChart<String, Number> chart14;    
    @FXML
    LineChart<String, Number> chart15;
    @FXML
    LineChart<String, Number> chart16;
    @FXML
    LineChart<String, Number> chart17;
    @FXML
    LineChart<String, Number> chart18;
    @FXML
    LineChart<String, Number> chart19;
    @FXML
    LineChart<String, Number> chart20;    
    @FXML
    LineChart<String, Number> chart21; 
    @FXML
    LineChart<String, Number> chart22; 
    @FXML
    LineChart<String, Number> chart23; 
    @FXML
    LineChart<String, Number> chart24;
    @FXML
    LineChart<String, Number> chart25;
    @FXML
    LineChart<String, Number> chart26;
    @FXML
    LineChart<String, Number> chart27;
    @FXML
    LineChart<String, Number> chart28;
    
    @FXML
    private Button btngenerateReport;
    
    //Action event fot generate report button.
    //Adapted from oracle website.
    //Accessed 30/03/19.
    //https://docs.oracle.com/javase/8/docs/api/java/awt/event/ActionEvent.html
    @FXML
    void generateReport(ActionEvent event) {
        class ExportToCSV {
        	
        }
        	PrintWriter pw;
                try {
                	   PrintWriter pw1= new PrintWriter(new File("src/application/Stocks.txt"));
                	   StringBuilder sb=new StringBuilder();
                	   sb.append("Number");
                	   sb.append(",");
                	   sb.append("Stock Symbol");
                	   sb.append(",");
                	   sb.append("Company Name");
                	   sb.append(",");
                	   sb.append("Highest");
                	   sb.append(",");
                	   sb.append("Lowest");
                	   sb.append(",");
                	   sb.append("Average Close");
                	   sb.append(",");
                	   sb.append("Close");
                	   sb.append("\r\n");
                	   sb.append("1");
                	   sb.append(",");
                	   sb.append("AHT");
                	   sb.append(",");
                	   sb.append("Ashtead Group plc");
                	   sb.append(",");
                	   sb.append("27/01/17");
                	   sb.append(",");
                	   sb.append("14/11/16");
                	   sb.append(",");
                	   sb.append("1569.292");
                	   sb.append(",");
                	   sb.append("1644");
                	   sb.append("\r\n");
                	   sb.append("2");
                	   sb.append(",");
                	   sb.append("ANTO");
                	   sb.append(",");
                	   sb.append("Antofagasta plc");
                	   sb.append(",");
                	   sb.append("20/12/16");
                	   sb.append(",");
                	   sb.append("25/01/17");
                	   sb.append(",");
                	   sb.append("733.6538");
                	   sb.append(",");
                	   sb.append("866");
                	   sb.append("\r\n");
                	   sb.append("3");
                	   sb.append(",");
                	   sb.append("BA");
                	   sb.append(",");
                	   sb.append("BAE Systems plc");
                	   sb.append(",");
                	   sb.append("13/01/17");
                	   sb.append(",");
                	   sb.append("15/12/16");
                	   sb.append(",");
                	   sb.append("597.4538");
                	   sb.append(",");
                	   sb.append("612");
                	   sb.append("\r\n");
                	   sb.append("4");
                	   sb.append(",");
                	   sb.append("BATS");
                	   sb.append(",");
                	   sb.append("British American Tobacco plc");
                	   sb.append(",");
                	   sb.append("10/02/17");
                	   sb.append(",");
                	   sb.append("15/11/16");
                	   sb.append(",");
                	   sb.append("4599.515");
                	   sb.append(",");
                	   sb.append("5008");
                	   sb.append("\r\n");
                	   sb.append("5");
                	   sb.append(",");
                	   sb.append("CCH");
                	   sb.append(",");
                	   sb.append("Coca-Cola HBC AG");
                	   sb.append(",");
                	   sb.append("09/02/17");
                	   sb.append(",");
                	   sb.append("15/12/16");
                	   sb.append(",");
                	   sb.append("1732.262");
                	   sb.append(",");
                	   sb.append("1826");
                	   sb.append("\r\n");
                	   sb.append("6");
                	   sb.append(",");
                	   sb.append("CCL");
                	   sb.append(",");
                	   sb.append("Carnival plc");
                	   sb.append(",");
                	   sb.append("27/01/17");
                	   sb.append(",");
                	   sb.append("19/12/16");
                	   sb.append(",");
                	   sb.append("4109.814");
                	   sb.append(",");
                	   sb.append("4301");
                	   sb.append("\r\n");
                	   sb.append("7");
                	   sb.append(",");
                	   sb.append("CNA");
                	   sb.append(",");
                	   sb.append("Centrica plc");
                	   sb.append(",");
                	   sb.append("03/01/17");
                	   sb.append(",");
                	   sb.append("22/11/16");
                	   sb.append(",");
                	   sb.append("221.7738");
                	   sb.append(",");
                	   sb.append("234");
                	   sb.append("\r\n");
                	   sb.append("8");
                	   sb.append(",");
                	   sb.append("CPG");
                	   sb.append(",");
                	   sb.append("Compass Group plc");
                	   sb.append(",");
                	   sb.append("02/12/16");
                	   sb.append(",");
                	   sb.append("03/01/17");
                	   sb.append(",");
                	   sb.append("1397.108");
                	   sb.append(",");
                	   sb.append("1445");
                	   sb.append("\r\n");
                	   sb.append("9");
                	   sb.append(",");
                	   sb.append("EXPN");
                	   sb.append(",");
                	   sb.append("Experian plc");
                	   sb.append(",");
                	   sb.append("17/01/17");
                	   sb.append(",");
                	   sb.append("15/11/16");
                	   sb.append(",");
                	   sb.append("1520.556");
                	   sb.append(",");
                	   sb.append("1565");
                	   sb.append("\r\n");
                	   sb.append("10");
                	   sb.append(",");
                	   sb.append("EZJ");
                	   sb.append(",");
                	   sb.append("EasyJet plc");
                	   sb.append(",");
                	   sb.append("18/11/16");
                	   sb.append(",");
                	   sb.append("08/02/17");
                	   sb.append(",");
                	   sb.append("954.1386");
                	   sb.append(",");
                	   sb.append("893.7");
                	   sb.append("\r\n");
                	   sb.append("11");
                	   sb.append(",");
                	   sb.append("GKN");
                	   sb.append(",");
                	   sb.append("GKN plc");
                	   sb.append(",");
                	   sb.append("27/01/17");
                	   sb.append(",");
                	   sb.append("05/12/16");
                	   sb.append(",");
                	   sb.append("327.9138");
                	   sb.append(",");
                	   sb.append("340.90");
                	   sb.append("\r\n");
                	   sb.append("12");
                	   sb.append(",");
                	   sb.append("MDC");
                	   sb.append(",");
                	   sb.append("Mediclinic International plc");
                	   sb.append(",");
                	   sb.append("10/02/17");
                	   sb.append(",");
                	   sb.append("02/12/16");
                	   sb.append(",");
                	   sb.append("760.2534");
                	   sb.append(",");
                	   sb.append("835.5");
                	   sb.append("\r\n");
                	   sb.append("13");
                	   sb.append(",");
                	   sb.append("PFG");
                	   sb.append(",");
                	   sb.append("Provident Financial plc");
                	   sb.append(",");
                	   sb.append("24/11/16");
                	   sb.append(",");
                	   sb.append("02/02/17");
                	   sb.append(",");
                	   sb.append("2812.477");
                	   sb.append(",");
                	   sb.append("2779");
                	   sb.append("\r\n");
                	   sb.append("14");
                	   sb.append(",");
                	   sb.append("PPB");
                	   sb.append(",");
                	   sb.append("Paddy Power Betfair plc");
                	   sb.append(",");
                	   sb.append("14/11/16");
                	   sb.append(",");
                	   sb.append("25/01/17");
                	   sb.append(",");
                	   sb.append("8540.923");
                	   sb.append(",");
                	   sb.append("8700");
                	   sb.append("\r\n");
                	   sb.append("15");
                	   sb.append(",");
                	   sb.append("PRU");
                	   sb.append(",");
                	   sb.append("Prudential plc");
                	   sb.append(",");
                	   sb.append("08/12/16");
                	   sb.append(",");
                	   sb.append("14/11/16");
                	   sb.append(",");
                	   sb.append("1576.654");
                	   sb.append(",");
                	   sb.append("1620.50");
                	   sb.append("\r\n");
                	   sb.append("16");
                	   sb.append(",");
                	   sb.append("PSN");
                	   sb.append(",");
                	   sb.append("Persimmon plc");
                	   sb.append(",");
                	   sb.append("09/02/17");
                	   sb.append(",");
                	   sb.append("13/12/16");
                	   sb.append(",");
                	   sb.append("1825.385");
                	   sb.append(",");
                	   sb.append("1976");
                	   sb.append("\r\n");
                	   sb.append("17");
                	   sb.append(",");
                	   sb.append("RB");
                	   sb.append(",");
                	   sb.append("Reckitt Benckiser Group plc");
                	   sb.append(",");
                	   sb.append("09/02/17");
                	   sb.append(",");
                	   sb.append("13/12/16");
                	   sb.append(",");
                	   sb.append("6719.288");
                	   sb.append(",");
                	   sb.append("6930");
                	   sb.append("\r\n");
                	   sb.append("18");
                	   sb.append(",");
                	   sb.append("RDSA");
                	   sb.append(",");
                	   sb.append("Royal Dutch Shell plc");
                	   sb.append(",");
                	   sb.append("10/02/17");
                	   sb.append(",");
                	   sb.append("15/11/16");
                	   sb.append(",");
                	   sb.append("4599.515");
                	   sb.append(",");
                	   sb.append("5008");
                	   sb.append("\r\n");
                	   sb.append("19");
                	   sb.append(",");
                	   sb.append("RR");
                	   sb.append(",");
                	   sb.append("Rolls-Royce Holdings plc");
                	   sb.append(",");
                	   sb.append("16/11/16");
                	   sb.append(",");
                	   sb.append("06/01/17");
                	   sb.append(",");
                	   sb.append("679.2769");
                	   sb.append(",");
                	   sb.append("732.50");
                	   sb.append("\r\n");
                	   sb.append("20");
                	   sb.append(",");
                	   sb.append("SDR");
                	   sb.append(",");
                	   sb.append("Schroders plc");
                	   sb.append(",");
                	   sb.append("18/01/17");
                	   sb.append(",");
                	   sb.append("01/12/16");
                	   sb.append(",");
                	   sb.append("2942.508");
                	   sb.append(",");
                	   sb.append("3041");
                	   sb.append("\r\n");
                	   sb.append("21");
                	   sb.append(",");
                	   sb.append("SHP");
                	   sb.append(",");
                	   sb.append("Shire plc");
                	   sb.append(",");
                	   sb.append("14/11/16");
                	   sb.append(",");
                	   sb.append("13/12/16");
                	   sb.append(",");
                	   sb.append("4586.80");
                	   sb.append(",");
                	   sb.append("4595");
                	   sb.append("\r\n");
                	   sb.append("22");
                	   sb.append(",");
                	   sb.append("SKY");
                	   sb.append(",");
                	   sb.append("SKY plc");
                	   sb.append(",");
                	   sb.append("08/02/17");
                	   sb.append(",");
                	   sb.append("24/11/16");
                	   sb.append(",");
                	   sb.append("928.90");
                	   sb.append(",");
                	   sb.append("1000");
                	   sb.append("\r\n");
                	   sb.append("23");
                	   sb.append(",");
                	   sb.append("SSE");
                	   sb.append(",");
                	   sb.append("SSE plc");
                	   sb.append(",");
                	   sb.append("13/01/17");
                	   sb.append(",");
                	   sb.append("15/11/16");
                	   sb.append(",");
                	   sb.append("1488.171");
                	   sb.append(",");
                	   sb.append("1537");
                	   sb.append("\r\n");
                	   sb.append("24");
                	   sb.append(",");
                	   sb.append("STJ");
                	   sb.append(",");
                	   sb.append("St.James's Place plc");
                	   sb.append(",");
                	   sb.append("26/01/17");
                	   sb.append(",");
                	   sb.append("28/11/16");
                	   sb.append(",");
                	   sb.append("1013.615");
                	   sb.append(",");
                	   sb.append("1083");
                	   sb.append("\r\n");
                	   sb.append("25");
                	   sb.append(",");
                	   sb.append("TSCO");
                	   sb.append(",");
                	   sb.append("Tesco plc");
                	   sb.append(",");
                	   sb.append("23/11/16");
                	   sb.append(",");
                	   sb.append("26/01/17");
                	   sb.append(",");
                	   sb.append("204.8315");
                	   sb.append(",");
                	   sb.append("198");
                	   sb.append("\r\n");
                	   sb.append("26");
                	   sb.append(",");
                	   sb.append("TUI");
                	   sb.append(",");
                	   sb.append("TUI AG");
                	   sb.append(",");
                	   sb.append("09/02/17");
                	   sb.append(",");
                	   sb.append("18/11/16");
                	   sb.append(",");
                	   sb.append("1053.015");
                	   sb.append(",");
                	   sb.append("1095");
                	   sb.append("\r\n");
                	   sb.append("27");
                	   sb.append(",");
                	   sb.append("VOD");
                	   sb.append(",");
                	   sb.append("Vodafone Group plc");
                	   sb.append(",");
                	   sb.append("13/01/17");
                	   sb.append(",");
                	   sb.append("06/12/16");
                	   sb.append(",");
                	   sb.append("199.7419");
                	   sb.append(",");
                	   sb.append("197.70");
                	   sb.append("\r\n");
                	   sb.append("28");
                	   sb.append(",");
                	   sb.append("WPG");
                	   sb.append(",");
                	   sb.append("Worldpay Group plc");
                	   sb.append(",");
                	   sb.append("12/01/17");
                	   sb.append(",");
                	   sb.append("08/12/16");
                	   sb.append(",");
                	   sb.append("273.7892");
                	   sb.append(",");
                	   sb.append("272");
                	   sb.append("\r\n");
                	   pw1.write(sb.toString());
                	   pw1.close();
                } catch (FileNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
                //End of reference.
              
                //Popup message box.
                //Adapted from stackoverflow.
                //Accessed 30/03/19.
                //https://stackoverflow.com/questions/7080205/popup-message-boxes
                Alert dg = new Alert(Alert.AlertType.INFORMATION);
                dg.setContentText("Generated, saved in application folder in the projects folder in a txt file called stocks");
                dg.show();
                //End of reference.
        }
    //javafx.scene.control.cell.PropertyValueFactory.
    //Adapted from program creek.
    //Accessed 31/03/19.
    //https://www.programcreek.com/java-api-examples/?api=javafx.scene.control.cell.PropertyValueFactory
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    	date.setCellValueFactory(new PropertyValueFactory<>("date"));
    	open.setCellValueFactory(new PropertyValueFactory<>("open"));
    	high.setCellValueFactory(new PropertyValueFactory<>("high"));
    	low.setCellValueFactory(new PropertyValueFactory<>("low"));
    	close.setCellValueFactory(new PropertyValueFactory<>("close"));
    	volume.setCellValueFactory(new PropertyValueFactory<>("volume"));
    	adjclose.setCellValueFactory(new PropertyValueFactory<>("adjclose"));
        date2.setCellValueFactory(new PropertyValueFactory<>("date2"));
    	open2.setCellValueFactory(new PropertyValueFactory<>("open2"));
    	high2.setCellValueFactory(new PropertyValueFactory<>("high2"));
    	low2.setCellValueFactory(new PropertyValueFactory<>("low2"));
    	close2.setCellValueFactory(new PropertyValueFactory<>("close2"));
    	volume2.setCellValueFactory(new PropertyValueFactory<>("volume2"));
        adjclose2.setCellValueFactory(new PropertyValueFactory<>("adjclose2"));
        date3.setCellValueFactory(new PropertyValueFactory<>("date3"));
    	open3.setCellValueFactory(new PropertyValueFactory<>("open3"));
    	high3.setCellValueFactory(new PropertyValueFactory<>("high3"));
    	low3.setCellValueFactory(new PropertyValueFactory<>("low3"));
    	close3.setCellValueFactory(new PropertyValueFactory<>("close3"));
    	volume3.setCellValueFactory(new PropertyValueFactory<>("volume3"));
        adjclose3.setCellValueFactory(new PropertyValueFactory<>("adjclose3"));
        date4.setCellValueFactory(new PropertyValueFactory<>("date4"));
    	open4.setCellValueFactory(new PropertyValueFactory<>("open4"));
    	high4.setCellValueFactory(new PropertyValueFactory<>("high4"));
    	low4.setCellValueFactory(new PropertyValueFactory<>("low4"));
    	close4.setCellValueFactory(new PropertyValueFactory<>("close4"));
    	volume4.setCellValueFactory(new PropertyValueFactory<>("volume4"));
        adjclose4.setCellValueFactory(new PropertyValueFactory<>("adjclose4"));
        date5.setCellValueFactory(new PropertyValueFactory<>("date5"));
    	open5.setCellValueFactory(new PropertyValueFactory<>("open5"));
    	high5.setCellValueFactory(new PropertyValueFactory<>("high5"));
    	low5.setCellValueFactory(new PropertyValueFactory<>("low5"));
    	close5.setCellValueFactory(new PropertyValueFactory<>("close5"));
    	volume5.setCellValueFactory(new PropertyValueFactory<>("volume5"));
        adjclose5.setCellValueFactory(new PropertyValueFactory<>("adjclose5"));
        date6.setCellValueFactory(new PropertyValueFactory<>("date6"));
    	open6.setCellValueFactory(new PropertyValueFactory<>("open6"));
    	high6.setCellValueFactory(new PropertyValueFactory<>("high6"));
    	low6.setCellValueFactory(new PropertyValueFactory<>("low6"));
    	close6.setCellValueFactory(new PropertyValueFactory<>("close6"));
    	volume6.setCellValueFactory(new PropertyValueFactory<>("volume6"));
        adjclose6.setCellValueFactory(new PropertyValueFactory<>("adjclose6"));
        date7.setCellValueFactory(new PropertyValueFactory<>("date7"));
    	open7.setCellValueFactory(new PropertyValueFactory<>("open7"));
    	high7.setCellValueFactory(new PropertyValueFactory<>("high7"));
    	low7.setCellValueFactory(new PropertyValueFactory<>("low7"));
    	close7.setCellValueFactory(new PropertyValueFactory<>("close7"));
    	volume7.setCellValueFactory(new PropertyValueFactory<>("volume7"));
        adjclose7.setCellValueFactory(new PropertyValueFactory<>("adjclose7"));
        date8.setCellValueFactory(new PropertyValueFactory<>("date8"));
    	open8.setCellValueFactory(new PropertyValueFactory<>("open8"));
    	high8.setCellValueFactory(new PropertyValueFactory<>("high8"));
    	low8.setCellValueFactory(new PropertyValueFactory<>("low8"));
    	close8.setCellValueFactory(new PropertyValueFactory<>("close8"));
    	volume8.setCellValueFactory(new PropertyValueFactory<>("volume8"));
        adjclose8.setCellValueFactory(new PropertyValueFactory<>("adjclose8"));
        date9.setCellValueFactory(new PropertyValueFactory<>("date9"));
    	open9.setCellValueFactory(new PropertyValueFactory<>("open9"));
    	high9.setCellValueFactory(new PropertyValueFactory<>("high9"));
    	low9.setCellValueFactory(new PropertyValueFactory<>("low9"));
    	close9.setCellValueFactory(new PropertyValueFactory<>("close9"));
    	volume9.setCellValueFactory(new PropertyValueFactory<>("volume9"));
        adjclose9.setCellValueFactory(new PropertyValueFactory<>("adjclose9"));
        date10.setCellValueFactory(new PropertyValueFactory<>("date10"));
    	open10.setCellValueFactory(new PropertyValueFactory<>("open10"));
    	high10.setCellValueFactory(new PropertyValueFactory<>("high10"));
    	low10.setCellValueFactory(new PropertyValueFactory<>("low10"));
    	close10.setCellValueFactory(new PropertyValueFactory<>("close10"));
    	volume10.setCellValueFactory(new PropertyValueFactory<>("volume10"));
        adjclose10.setCellValueFactory(new PropertyValueFactory<>("adjclose10"));
        date11.setCellValueFactory(new PropertyValueFactory<>("date11"));
    	open11.setCellValueFactory(new PropertyValueFactory<>("open11"));
    	high11.setCellValueFactory(new PropertyValueFactory<>("high11"));
    	low11.setCellValueFactory(new PropertyValueFactory<>("low11"));
    	close11.setCellValueFactory(new PropertyValueFactory<>("close11"));
    	volume11.setCellValueFactory(new PropertyValueFactory<>("volume11"));
        adjclose11.setCellValueFactory(new PropertyValueFactory<>("adjclose11"));
        date12.setCellValueFactory(new PropertyValueFactory<>("date12"));
    	open12.setCellValueFactory(new PropertyValueFactory<>("open12"));
    	high12.setCellValueFactory(new PropertyValueFactory<>("high12"));
    	low12.setCellValueFactory(new PropertyValueFactory<>("low12"));
    	close12.setCellValueFactory(new PropertyValueFactory<>("close12"));
    	volume12.setCellValueFactory(new PropertyValueFactory<>("volume12"));
        adjclose12.setCellValueFactory(new PropertyValueFactory<>("adjclose12"));
        date13.setCellValueFactory(new PropertyValueFactory<>("date13"));
    	open13.setCellValueFactory(new PropertyValueFactory<>("open13"));
    	high13.setCellValueFactory(new PropertyValueFactory<>("high13"));
    	low13.setCellValueFactory(new PropertyValueFactory<>("low13"));
    	close13.setCellValueFactory(new PropertyValueFactory<>("close13"));
    	volume13.setCellValueFactory(new PropertyValueFactory<>("volume13"));
        adjclose13.setCellValueFactory(new PropertyValueFactory<>("adjclose13"));
        date14.setCellValueFactory(new PropertyValueFactory<>("date14"));
    	open14.setCellValueFactory(new PropertyValueFactory<>("open14"));
    	high14.setCellValueFactory(new PropertyValueFactory<>("high14"));
    	low14.setCellValueFactory(new PropertyValueFactory<>("low14"));
    	close14.setCellValueFactory(new PropertyValueFactory<>("close14"));
    	volume14.setCellValueFactory(new PropertyValueFactory<>("volume14"));
        adjclose14.setCellValueFactory(new PropertyValueFactory<>("adjclose14"));
        date15.setCellValueFactory(new PropertyValueFactory<>("date15"));
    	open15.setCellValueFactory(new PropertyValueFactory<>("open15"));
    	high15.setCellValueFactory(new PropertyValueFactory<>("high15"));
    	low15.setCellValueFactory(new PropertyValueFactory<>("low15"));
    	close15.setCellValueFactory(new PropertyValueFactory<>("close15"));
    	volume15.setCellValueFactory(new PropertyValueFactory<>("volume15"));
        adjclose15.setCellValueFactory(new PropertyValueFactory<>("adjclose15"));
        date16.setCellValueFactory(new PropertyValueFactory<>("date16"));
    	open16.setCellValueFactory(new PropertyValueFactory<>("open16"));
    	high16.setCellValueFactory(new PropertyValueFactory<>("high16"));
    	low16.setCellValueFactory(new PropertyValueFactory<>("low16"));
    	close16.setCellValueFactory(new PropertyValueFactory<>("close16"));
    	volume16.setCellValueFactory(new PropertyValueFactory<>("volume16"));
        adjclose16.setCellValueFactory(new PropertyValueFactory<>("adjclose16"));
        date17.setCellValueFactory(new PropertyValueFactory<>("date17"));
    	open17.setCellValueFactory(new PropertyValueFactory<>("open17"));
    	high17.setCellValueFactory(new PropertyValueFactory<>("high17"));
    	low17.setCellValueFactory(new PropertyValueFactory<>("low17"));
    	close17.setCellValueFactory(new PropertyValueFactory<>("close17"));
    	volume17.setCellValueFactory(new PropertyValueFactory<>("volume17"));
        adjclose17.setCellValueFactory(new PropertyValueFactory<>("adjclose17"));
        date18.setCellValueFactory(new PropertyValueFactory<>("date18"));
    	open18.setCellValueFactory(new PropertyValueFactory<>("open18"));
    	high18.setCellValueFactory(new PropertyValueFactory<>("high18"));
    	low18.setCellValueFactory(new PropertyValueFactory<>("low18"));
    	close18.setCellValueFactory(new PropertyValueFactory<>("close18"));
    	volume18.setCellValueFactory(new PropertyValueFactory<>("volume18"));
        adjclose18.setCellValueFactory(new PropertyValueFactory<>("adjclose18"));
        date19.setCellValueFactory(new PropertyValueFactory<>("date19"));
    	open19.setCellValueFactory(new PropertyValueFactory<>("open19"));
    	high19.setCellValueFactory(new PropertyValueFactory<>("high19"));
    	low19.setCellValueFactory(new PropertyValueFactory<>("low19"));
    	close19.setCellValueFactory(new PropertyValueFactory<>("close19"));
    	volume19.setCellValueFactory(new PropertyValueFactory<>("volume19"));
        adjclose19.setCellValueFactory(new PropertyValueFactory<>("adjclose19"));
        date20.setCellValueFactory(new PropertyValueFactory<>("date20"));
    	open20.setCellValueFactory(new PropertyValueFactory<>("open20"));
    	high20.setCellValueFactory(new PropertyValueFactory<>("high20"));
    	low20.setCellValueFactory(new PropertyValueFactory<>("low20"));
    	close20.setCellValueFactory(new PropertyValueFactory<>("close20"));
    	volume20.setCellValueFactory(new PropertyValueFactory<>("volume20"));
        adjclose20.setCellValueFactory(new PropertyValueFactory<>("adjclose20"));
        date21.setCellValueFactory(new PropertyValueFactory<>("date21"));
    	open21.setCellValueFactory(new PropertyValueFactory<>("open21"));
    	high21.setCellValueFactory(new PropertyValueFactory<>("high21"));
    	low21.setCellValueFactory(new PropertyValueFactory<>("low21"));
    	close21.setCellValueFactory(new PropertyValueFactory<>("close21"));
    	volume21.setCellValueFactory(new PropertyValueFactory<>("volume21"));
        adjclose21.setCellValueFactory(new PropertyValueFactory<>("adjclose21"));
        date22.setCellValueFactory(new PropertyValueFactory<>("date22"));
    	open22.setCellValueFactory(new PropertyValueFactory<>("open22"));
    	high22.setCellValueFactory(new PropertyValueFactory<>("high22"));
    	low22.setCellValueFactory(new PropertyValueFactory<>("low22"));
    	close22.setCellValueFactory(new PropertyValueFactory<>("close22"));
    	volume22.setCellValueFactory(new PropertyValueFactory<>("volume22"));
        adjclose22.setCellValueFactory(new PropertyValueFactory<>("adjclose22"));
        date23.setCellValueFactory(new PropertyValueFactory<>("date23"));
    	open23.setCellValueFactory(new PropertyValueFactory<>("open23"));
    	high23.setCellValueFactory(new PropertyValueFactory<>("high23"));
    	low23.setCellValueFactory(new PropertyValueFactory<>("low23"));
    	close23.setCellValueFactory(new PropertyValueFactory<>("close23"));
    	volume23.setCellValueFactory(new PropertyValueFactory<>("volume23"));
        adjclose23.setCellValueFactory(new PropertyValueFactory<>("adjclose23"));
        date24.setCellValueFactory(new PropertyValueFactory<>("date24"));
    	open24.setCellValueFactory(new PropertyValueFactory<>("open24"));
    	high24.setCellValueFactory(new PropertyValueFactory<>("high24"));
    	low24.setCellValueFactory(new PropertyValueFactory<>("low24"));
    	close24.setCellValueFactory(new PropertyValueFactory<>("close24"));
    	volume24.setCellValueFactory(new PropertyValueFactory<>("volume24"));
        adjclose24.setCellValueFactory(new PropertyValueFactory<>("adjclose24"));
        date25.setCellValueFactory(new PropertyValueFactory<>("date25"));
    	open25.setCellValueFactory(new PropertyValueFactory<>("open25"));
    	high25.setCellValueFactory(new PropertyValueFactory<>("high25"));
    	low25.setCellValueFactory(new PropertyValueFactory<>("low25"));
    	close25.setCellValueFactory(new PropertyValueFactory<>("close25"));
    	volume25.setCellValueFactory(new PropertyValueFactory<>("volume25"));
        adjclose25.setCellValueFactory(new PropertyValueFactory<>("adjclose25"));
        date26.setCellValueFactory(new PropertyValueFactory<>("date26"));
    	open26.setCellValueFactory(new PropertyValueFactory<>("open26"));
    	high26.setCellValueFactory(new PropertyValueFactory<>("high26"));
    	low26.setCellValueFactory(new PropertyValueFactory<>("low26"));
    	close26.setCellValueFactory(new PropertyValueFactory<>("close26"));
    	volume26.setCellValueFactory(new PropertyValueFactory<>("volume26"));
        adjclose26.setCellValueFactory(new PropertyValueFactory<>("adjclose26"));
        date27.setCellValueFactory(new PropertyValueFactory<>("date27"));
    	open27.setCellValueFactory(new PropertyValueFactory<>("open27"));
    	high27.setCellValueFactory(new PropertyValueFactory<>("high27"));
    	low27.setCellValueFactory(new PropertyValueFactory<>("low27"));
    	close27.setCellValueFactory(new PropertyValueFactory<>("close27"));
    	volume27.setCellValueFactory(new PropertyValueFactory<>("volume27"));
        adjclose27.setCellValueFactory(new PropertyValueFactory<>("adjclose27"));
        date28.setCellValueFactory(new PropertyValueFactory<>("date28"));
    	open28.setCellValueFactory(new PropertyValueFactory<>("open28"));
    	high28.setCellValueFactory(new PropertyValueFactory<>("high28"));
    	low28.setCellValueFactory(new PropertyValueFactory<>("low28"));
    	close28.setCellValueFactory(new PropertyValueFactory<>("close28"));
    	volume28.setCellValueFactory(new PropertyValueFactory<>("volume28"));
        adjclose28.setCellValueFactory(new PropertyValueFactory<>("adjclose28"));
        //End of reference.
        
        AHT.getItems().setAll(InsertAHT());
        ANTO.getItems().setAll(InsertANTO());
        BA.getItems().setAll(InsertBA());
        BATS.getItems().setAll(InsertBATS());
        CCH.getItems().setAll(InsertCCH());
        CCL.getItems().setAll(InsertCCL());
        CNA.getItems().setAll(InsertCNA());
        CPG.getItems().setAll(InsertCPG());
        EXPN.getItems().setAll(InsertEXPN());
        EZJ.getItems().setAll(InsertEZJ());
        GKN.getItems().setAll(InsertGKN());
        MDC.getItems().setAll(InsertMDC());
        PFG.getItems().setAll(InsertPFG());
        PPB.getItems().setAll(InsertPPB());
        PRU.getItems().setAll(InsertPRU());
        PSN.getItems().setAll(InsertPSN());
        RB.getItems().setAll(InsertRB());
        RDSA.getItems().setAll(InsertRDSA());
        RR.getItems().setAll(InsertRR());
        SDR.getItems().setAll(InsertSDR());
        SHP.getItems().setAll(InsertSHP());
        SKY.getItems().setAll(InsertSKY());
        SSE.getItems().setAll(InsertSSE());
        STJ.getItems().setAll(InsertSTJ());
        TSCO.getItems().setAll(InsertTSCO());
        TUI.getItems().setAll(InsertTUI());
        VOD.getItems().setAll(InsertVOD());
        WPG.getItems().setAll(InsertWPG());
        
        //Code to create a line chart.
        //Adapted from program creek.
        //Accessed 31/03/19.
        //https://www.programcreek.com/java-api-examples/index.php?api=javafx.scene.chart.XYChart.Series
        XYChart.Series<String, Number> series1 = new XYChart.Series<>();
        series1.setName("Series 1");
        series1.getData().add(new XYChart.Data<>("2016-11-14", 1425.736));
        series1.getData().add(new XYChart.Data<>("2016-11-15", 1429.724));
        series1.getData().add(new XYChart.Data<>("2016-11-16", 1406.793));
        series1.getData().add(new XYChart.Data<>("2016-11-17", 1408.787));
        series1.getData().add(new XYChart.Data<>("2016-11-18", 1402.805));
        series1.getData().add(new XYChart.Data<>("2016-11-21", 1415.766));
        series1.getData().add(new XYChart.Data<>("2016-11-22", 1441.688));
        series1.getData().add(new XYChart.Data<>("2016-11-23", 1455.647));
        series1.getData().add(new XYChart.Data<>("2016-11-24", 1491.539));
        series1.getData().add(new XYChart.Data<>("2016-11-25", 1495.527));
        series1.getData().add(new XYChart.Data<>("2016-11-28", 1480.572));
        series1.getData().add(new XYChart.Data<>("2016-11-29", 1506.495));
        series1.getData().add(new XYChart.Data<>("2016-11-30", 1562.328));
        series1.getData().add(new XYChart.Data<>("2016-12-01", 1545.378));
        series1.getData().add(new XYChart.Data<>("2016-12-02", 1530.423));
        series1.getData().add(new XYChart.Data<>("2016-12-05", 1535.408));
        series1.getData().add(new XYChart.Data<>("2016-12-06", 1551.36));
        series1.getData().add(new XYChart.Data<>("2016-12-07", 1612.178));
        series1.getData().add(new XYChart.Data<>("2016-12-08", 1605.199));
        series1.getData().add(new XYChart.Data<>("2016-12-09", 1635.11));
        series1.getData().add(new XYChart.Data<>("2016-12-12", 1639.098));
        series1.getData().add(new XYChart.Data<>("2016-12-13", 1620.155));
        series1.getData().add(new XYChart.Data<>("2016-12-14", 1604.202));
        series1.getData().add(new XYChart.Data<>("2016-12-15", 1611.181));
        series1.getData().add(new XYChart.Data<>("2016-12-16", 1606.196));
        series1.getData().add(new XYChart.Data<>("2016-12-19", 1529.426));
        series1.getData().add(new XYChart.Data<>("2016-12-20", 1555.348));
        series1.getData().add(new XYChart.Data<>("2016-12-21", 1576.286));
        series1.getData().add(new XYChart.Data<>("2016-12-22", 1576.288));
        series1.getData().add(new XYChart.Data<>("2016-12-23", 1562.328));
        series1.getData().add(new XYChart.Data<>("2016-12-26", 1562.328));
        series1.getData().add(new XYChart.Data<>("2016-12-27", 1562.328));
        series1.getData().add(new XYChart.Data<>("2016-12-28", 1604.202));
        series1.getData().add(new XYChart.Data<>("2016-12-29", 1567.313));
        series1.getData().add(new XYChart.Data<>("2016-12-30", 1575.289));
        series1.getData().add(new XYChart.Data<>("2017-01-02", 1575.289));
        series1.getData().add(new XYChart.Data<>("2017-01-03", 1592.238));
        series1.getData().add(new XYChart.Data<>("2017-01-04", 1587.253));
        series1.getData().add(new XYChart.Data<>("2017-01-05", 1596.226));
        series1.getData().add(new XYChart.Data<>("2017-01-06", 1587.253));
        series1.getData().add(new XYChart.Data<>("2017-01-09", 1578.28));
        series1.getData().add(new XYChart.Data<>("2017-01-10", 1596.226));
        series1.getData().add(new XYChart.Data<>("2017-01-11", 1615.17));
        series1.getData().add(new XYChart.Data<>("2017-01-12", 1591.241));
        series1.getData().add(new XYChart.Data<>("2017-01-13", 1595.229));
        series1.getData().add(new XYChart.Data<>("2017-01-16", 1609.187));
        series1.getData().add(new XYChart.Data<>("2017-01-17", 1584.262));
        series1.getData().add(new XYChart.Data<>("2017-01-18", 1588.25));
        series1.getData().add(new XYChart.Data<>("2017-01-19", 1570.00));
        series1.getData().add(new XYChart.Data<>("2017-01-20", 1575.00));
        series1.getData().add(new XYChart.Data<>("2017-01-23", 1565.00));
        series1.getData().add(new XYChart.Data<>("2017-01-24", 1564.00));
        series1.getData().add(new XYChart.Data<>("2017-01-25", 1594.00));
        series1.getData().add(new XYChart.Data<>("2017-01-26", 1649.00));
        series1.getData().add(new XYChart.Data<>("2017-01-27", 1639.00));
        series1.getData().add(new XYChart.Data<>("2017-01-30", 1601.00));
        series1.getData().add(new XYChart.Data<>("2017-01-31", 1606.00));
        series1.getData().add(new XYChart.Data<>("2017-02-01", 1628.00));
        series1.getData().add(new XYChart.Data<>("2017-02-02", 1619.00));
        series1.getData().add(new XYChart.Data<>("2017-02-03", 1622.00));
        series1.getData().add(new XYChart.Data<>("2017-02-06", 1641.00));
        series1.getData().add(new XYChart.Data<>("2017-02-07", 1633.00));
        series1.getData().add(new XYChart.Data<>("2017-02-08", 1622.00));
        series1.getData().add(new XYChart.Data<>("2017-02-09", 1623.00));
        series1.getData().add(new XYChart.Data<>("2017-02-10", 1644.00));
        chart1.getData().add(series1);
        
        XYChart.Series<String, Number> series2 = new XYChart.Series<>();
        series2.setName("Series 1");
        series2.getData().add(new XYChart.Data<>("2016-11-14", 706.00));
        series2.getData().add(new XYChart.Data<>("2016-11-15", 671.00));
        series2.getData().add(new XYChart.Data<>("2016-11-16", 672.00));
        series2.getData().add(new XYChart.Data<>("2016-11-17", 687.50));
        series2.getData().add(new XYChart.Data<>("2016-11-18", 666.00));
        series2.getData().add(new XYChart.Data<>("2016-11-21", 681.50));
        series2.getData().add(new XYChart.Data<>("2016-11-22", 702.00));
        series2.getData().add(new XYChart.Data<>("2016-11-23", 701.00));
        series2.getData().add(new XYChart.Data<>("2016-11-24", 719.00));
        series2.getData().add(new XYChart.Data<>("2016-11-25", 722.50));
        series2.getData().add(new XYChart.Data<>("2016-11-28", 728.50));
        series2.getData().add(new XYChart.Data<>("2016-11-29", 700.00));
        series2.getData().add(new XYChart.Data<>("2016-11-30", 689.00));
        series2.getData().add(new XYChart.Data<>("2016-12-01", 705.50));
        series2.getData().add(new XYChart.Data<>("2016-12-02", 693.50));
        series2.getData().add(new XYChart.Data<>("2016-12-05", 727.50));
        series2.getData().add(new XYChart.Data<>("2016-12-06", 727.50));
        series2.getData().add(new XYChart.Data<>("2016-12-07", 740.50));
        series2.getData().add(new XYChart.Data<>("2016-12-08", 752.00));
        series2.getData().add(new XYChart.Data<>("2016-12-09", 756.50));
        series2.getData().add(new XYChart.Data<>("2016-12-12", 774.50));
        series2.getData().add(new XYChart.Data<>("2016-12-13", 738.50));
        series2.getData().add(new XYChart.Data<>("2016-12-14", 721.00));
        series2.getData().add(new XYChart.Data<>("2016-12-15", 683.50));
        series2.getData().add(new XYChart.Data<>("2016-12-16", 670.00));
        series2.getData().add(new XYChart.Data<>("2016-12-19", 661.50));
        series2.getData().add(new XYChart.Data<>("2016-12-20", 667.00));
        series2.getData().add(new XYChart.Data<>("2016-12-21", 674.50));
        series2.getData().add(new XYChart.Data<>("2016-12-22", 672.00));
        series2.getData().add(new XYChart.Data<>("2016-12-23", 675.50));
        series2.getData().add(new XYChart.Data<>("2016-12-26", 675.50));
        series2.getData().add(new XYChart.Data<>("2016-12-27", 675.50));
        series2.getData().add(new XYChart.Data<>("2016-12-28", 685.50));
        series2.getData().add(new XYChart.Data<>("2016-12-29", 676.50));
        series2.getData().add(new XYChart.Data<>("2016-12-30", 675.00));
        series2.getData().add(new XYChart.Data<>("2017-01-02", 675.00));
        series2.getData().add(new XYChart.Data<>("2017-01-03", 690.00));
        series2.getData().add(new XYChart.Data<>("2017-01-04", 691.50));
        series2.getData().add(new XYChart.Data<>("2017-01-05", 699.50));
        series2.getData().add(new XYChart.Data<>("2017-01-06", 694.00));
        series2.getData().add(new XYChart.Data<>("2017-01-09", 704.00));
        series2.getData().add(new XYChart.Data<>("2017-01-10", 723.00));
        series2.getData().add(new XYChart.Data<>("2017-01-11", 721.00));
        series2.getData().add(new XYChart.Data<>("2017-01-12", 721.50));
        series2.getData().add(new XYChart.Data<>("2017-01-13", 725.00));
        series2.getData().add(new XYChart.Data<>("2017-01-16", 733.50));
        series2.getData().add(new XYChart.Data<>("2017-01-17", 721.00));
        series2.getData().add(new XYChart.Data<>("2017-01-18", 747.00));
        series2.getData().add(new XYChart.Data<>("2017-01-19", 752.50));
        series2.getData().add(new XYChart.Data<>("2017-01-20", 762.00));
        series2.getData().add(new XYChart.Data<>("2017-01-23", 789.50));
        series2.getData().add(new XYChart.Data<>("2017-01-24", 824.00));
        series2.getData().add(new XYChart.Data<>("2017-01-25", 857.50));
        series2.getData().add(new XYChart.Data<>("2017-01-26", 837.00));
        series2.getData().add(new XYChart.Data<>("2017-01-27", 822.50));
        series2.getData().add(new XYChart.Data<>("2017-01-30", 814.00));
        series2.getData().add(new XYChart.Data<>("2017-01-31", 835.00));
        series2.getData().add(new XYChart.Data<>("2017-02-01", 835.50));
        series2.getData().add(new XYChart.Data<>("2017-02-02", 840.50));
        series2.getData().add(new XYChart.Data<>("2017-02-03", 813.00));
        series2.getData().add(new XYChart.Data<>("2017-02-06", 817.50));
        series2.getData().add(new XYChart.Data<>("2017-02-07", 836.00));
        series2.getData().add(new XYChart.Data<>("2017-02-08", 836.50));
        series2.getData().add(new XYChart.Data<>("2017-02-09", 827.50));
        series2.getData().add(new XYChart.Data<>("2017-02-10", 866.00));
        chart2.getData().add(series2);
        
        XYChart.Series<String, Number> series3 = new XYChart.Series<>();
        series3.setName("Series 1");
        series3.getData().add(new XYChart.Data<>("2016-11-14", 593.50));
        series3.getData().add(new XYChart.Data<>("2016-11-15", 600.00));
        series3.getData().add(new XYChart.Data<>("2016-11-16", 599.50));
        series3.getData().add(new XYChart.Data<>("2016-11-17", 597.50));
        series3.getData().add(new XYChart.Data<>("2016-11-18", 593.50));
        series3.getData().add(new XYChart.Data<>("2016-11-21", 597.50));
        series3.getData().add(new XYChart.Data<>("2016-11-22", 596.00));
        series3.getData().add(new XYChart.Data<>("2016-11-23", 603.00));
        series3.getData().add(new XYChart.Data<>("2016-11-24", 608.50));
        series3.getData().add(new XYChart.Data<>("2016-11-25", 604.00));
        series3.getData().add(new XYChart.Data<>("2016-11-28", 603.00));
        series3.getData().add(new XYChart.Data<>("2016-11-29", 601.50));
        series3.getData().add(new XYChart.Data<>("2016-11-30", 600.50));
        series3.getData().add(new XYChart.Data<>("2016-12-01", 598.00));
        series3.getData().add(new XYChart.Data<>("2016-12-02", 594.00));
        series3.getData().add(new XYChart.Data<>("2016-12-05", 600.00));
        series3.getData().add(new XYChart.Data<>("2016-12-06", 598.50));
        series3.getData().add(new XYChart.Data<>("2016-12-07", 604.50));
        series3.getData().add(new XYChart.Data<>("2016-12-08", 604.00));
        series3.getData().add(new XYChart.Data<>("2016-12-09", 600.50));
        series3.getData().add(new XYChart.Data<>("2016-12-12", 586.00));
        series3.getData().add(new XYChart.Data<>("2016-12-13", 597.50));
        series3.getData().add(new XYChart.Data<>("2016-12-14", 598.00));
        series3.getData().add(new XYChart.Data<>("2016-12-15", 591.00));
        series3.getData().add(new XYChart.Data<>("2016-12-16", 592.50));
        series3.getData().add(new XYChart.Data<>("2016-12-19", 596.50));
        series3.getData().add(new XYChart.Data<>("2016-12-20", 598.50));
        series3.getData().add(new XYChart.Data<>("2016-12-21", 596.00));
        series3.getData().add(new XYChart.Data<>("2016-12-22", 593.00));
        series3.getData().add(new XYChart.Data<>("2016-12-23", 593.50));
        series3.getData().add(new XYChart.Data<>("2016-12-26", 593.50));
        series3.getData().add(new XYChart.Data<>("2016-12-27", 593.50));
        series3.getData().add(new XYChart.Data<>("2016-12-28", 599.00));
        series3.getData().add(new XYChart.Data<>("2016-12-29", 595.00));
        series3.getData().add(new XYChart.Data<>("2016-12-30", 591.50));
        series3.getData().add(new XYChart.Data<>("2017-01-02", 591.50));
        series3.getData().add(new XYChart.Data<>("2017-01-03", 591.00));
        series3.getData().add(new XYChart.Data<>("2017-01-04", 585.00));
        series3.getData().add(new XYChart.Data<>("2017-01-05", 587.50));
        series3.getData().add(new XYChart.Data<>("2017-01-06", 605.00));
        series3.getData().add(new XYChart.Data<>("2017-01-09", 597.50));
        series3.getData().add(new XYChart.Data<>("2017-01-10", 610.00));
        series3.getData().add(new XYChart.Data<>("2017-01-11", 610.00));
        series3.getData().add(new XYChart.Data<>("2017-01-12", 617.50));
        series3.getData().add(new XYChart.Data<>("2017-01-13", 611.50));
        series3.getData().add(new XYChart.Data<>("2017-01-16", 611.50));
        series3.getData().add(new XYChart.Data<>("2017-01-17", 605.00));
        series3.getData().add(new XYChart.Data<>("2017-01-18", 605.00));
        series3.getData().add(new XYChart.Data<>("2017-01-19", 602.00));
        series3.getData().add(new XYChart.Data<>("2017-01-20", 600.50));
        series3.getData().add(new XYChart.Data<>("2017-01-23", 600.00));
        series3.getData().add(new XYChart.Data<>("2017-01-24", 598.00));
        series3.getData().add(new XYChart.Data<>("2017-01-25", 600.50));
        series3.getData().add(new XYChart.Data<>("2017-01-26", 596.00));
        series3.getData().add(new XYChart.Data<>("2017-01-27", 592.50));
        series3.getData().add(new XYChart.Data<>("2017-01-30", 585.00));
        series3.getData().add(new XYChart.Data<>("2017-01-31", 582.00));
        series3.getData().add(new XYChart.Data<>("2017-02-01", 582.50));
        series3.getData().add(new XYChart.Data<>("2017-02-02", 583.50));
        series3.getData().add(new XYChart.Data<>("2017-02-03", 583.50));
        series3.getData().add(new XYChart.Data<>("2017-02-06", 588.00));
        series3.getData().add(new XYChart.Data<>("2017-02-07", 598.00));
        series3.getData().add(new XYChart.Data<>("2017-02-08", 599.50));
        series3.getData().add(new XYChart.Data<>("2017-02-09", 600.00));
        series3.getData().add(new XYChart.Data<>("2017-02-10", 612.00));
        chart3.getData().add(series3);
        
        XYChart.Series<String, Number> series4 = new XYChart.Series<>();
        series4.setName("Series 1");
        series4.getData().add(new XYChart.Data<>("2016-11-14", 4281.00));
        series4.getData().add(new XYChart.Data<>("2016-11-15", 4300.50));
        series4.getData().add(new XYChart.Data<>("2016-11-16", 4278.00));
        series4.getData().add(new XYChart.Data<>("2016-11-17", 4311.00));
        series4.getData().add(new XYChart.Data<>("2016-11-18", 4359.50));
        series4.getData().add(new XYChart.Data<>("2016-11-21", 4357.50));
        series4.getData().add(new XYChart.Data<>("2016-11-22", 4368.50));
        series4.getData().add(new XYChart.Data<>("2016-11-23", 4368.50));
        series4.getData().add(new XYChart.Data<>("2016-11-24", 4372.00));
        series4.getData().add(new XYChart.Data<>("2016-11-25", 4421.00));
        series4.getData().add(new XYChart.Data<>("2016-11-28", 4448.50));
        series4.getData().add(new XYChart.Data<>("2016-11-29", 4454.50));
        series4.getData().add(new XYChart.Data<>("2016-11-30", 4393.50));
        series4.getData().add(new XYChart.Data<>("2016-12-01", 4309.50));
        series4.getData().add(new XYChart.Data<>("2016-12-02", 4347.00));
        series4.getData().add(new XYChart.Data<>("2016-12-05", 4343.00));
        series4.getData().add(new XYChart.Data<>("2016-12-06", 4320.00));
        series4.getData().add(new XYChart.Data<>("2016-12-07", 4352.50));
        series4.getData().add(new XYChart.Data<>("2016-12-08", 4373.00));
        series4.getData().add(new XYChart.Data<>("2016-12-09", 4420.00));
        series4.getData().add(new XYChart.Data<>("2016-12-12", 4366.00));
        series4.getData().add(new XYChart.Data<>("2016-12-13", 4452.50));
        series4.getData().add(new XYChart.Data<>("2016-12-14", 4468.50));
        series4.getData().add(new XYChart.Data<>("2016-12-15", 4513.00));
        series4.getData().add(new XYChart.Data<>("2016-12-16", 4506.50));
        series4.getData().add(new XYChart.Data<>("2016-12-19", 4551.50));
        series4.getData().add(new XYChart.Data<>("2016-12-20", 4556.00));
        series4.getData().add(new XYChart.Data<>("2016-12-21", 4560.50));
        series4.getData().add(new XYChart.Data<>("2016-12-22", 4546.50));
        series4.getData().add(new XYChart.Data<>("2016-12-23", 4558.00));
        series4.getData().add(new XYChart.Data<>("2016-12-26", 4558.00));
        series4.getData().add(new XYChart.Data<>("2016-12-27", 4558.00));
        series4.getData().add(new XYChart.Data<>("2016-12-28", 4567.00));
        series4.getData().add(new XYChart.Data<>("2016-12-29", 4596.50));
        series4.getData().add(new XYChart.Data<>("2016-12-30", 4621.50));
        series4.getData().add(new XYChart.Data<>("2017-01-02", 4621.50));
        series4.getData().add(new XYChart.Data<>("2017-01-03", 4612.00));
        series4.getData().add(new XYChart.Data<>("2017-01-04", 4591.50));
        series4.getData().add(new XYChart.Data<>("2017-01-05", 4580.00));
        series4.getData().add(new XYChart.Data<>("2017-01-06", 4574.00));
        series4.getData().add(new XYChart.Data<>("2017-01-09", 4675.00));
        series4.getData().add(new XYChart.Data<>("2017-01-10", 4672.00));
        series4.getData().add(new XYChart.Data<>("2017-01-11", 4713.00));
        series4.getData().add(new XYChart.Data<>("2017-01-12", 4705.00));
        series4.getData().add(new XYChart.Data<>("2017-01-13", 4729.50));
        series4.getData().add(new XYChart.Data<>("2017-01-16", 4762.50));
        series4.getData().add(new XYChart.Data<>("2017-01-17", 4580.00));
        series4.getData().add(new XYChart.Data<>("2017-01-18", 4634.00));
        series4.getData().add(new XYChart.Data<>("2017-01-19", 4734.00));
        series4.getData().add(new XYChart.Data<>("2017-01-20", 4760.00));
        series4.getData().add(new XYChart.Data<>("2017-01-23", 4767.00));
        series4.getData().add(new XYChart.Data<>("2017-01-24", 4800.00));
        series4.getData().add(new XYChart.Data<>("2017-01-25", 4894.00));
        series4.getData().add(new XYChart.Data<>("2017-01-26", 4929.50));
        series4.getData().add(new XYChart.Data<>("2017-01-27", 4920.50));
        series4.getData().add(new XYChart.Data<>("2017-01-30", 4896.50));
        series4.getData().add(new XYChart.Data<>("2017-01-31", 4899.50));
        series4.getData().add(new XYChart.Data<>("2017-02-01", 4865.50));
        series4.getData().add(new XYChart.Data<>("2017-02-02", 4910.00));
        series4.getData().add(new XYChart.Data<>("2017-02-03", 4963.00));
        series4.getData().add(new XYChart.Data<>("2017-02-06", 4985.00));
        series4.getData().add(new XYChart.Data<>("2017-02-07", 4981.50));
        series4.getData().add(new XYChart.Data<>("2017-02-08", 5025.00));
        series4.getData().add(new XYChart.Data<>("2017-02-09", 5021.00));
        series4.getData().add(new XYChart.Data<>("2017-02-10", 5008.00));
        chart4.getData().add(series4);
        
        XYChart.Series<String, Number> series5 = new XYChart.Series<>();
        series5.setName("Series 1");
        series5.getData().add(new XYChart.Data<>("2016-11-14", 1651.00));
        series5.getData().add(new XYChart.Data<>("2016-11-15", 1679.00)); 
        series5.getData().add(new XYChart.Data<>("2016-11-16", 1662.00)); 
        series5.getData().add(new XYChart.Data<>("2016-11-17", 1661.00));
        series5.getData().add(new XYChart.Data<>("2016-11-18", 1674.00));
        series5.getData().add(new XYChart.Data<>("2016-11-21", 1687.00));
        series5.getData().add(new XYChart.Data<>("2016-11-22", 1673.00));
        series5.getData().add(new XYChart.Data<>("2016-11-23", 1679.00));
        series5.getData().add(new XYChart.Data<>("2016-11-24", 1677.00));
        series5.getData().add(new XYChart.Data<>("2016-11-25", 1684.00));
        series5.getData().add(new XYChart.Data<>("2016-11-28", 1682.00));
        series5.getData().add(new XYChart.Data<>("2016-11-29", 1675.00));
        series5.getData().add(new XYChart.Data<>("2016-11-30", 1700.00));
        series5.getData().add(new XYChart.Data<>("2016-12-01", 1633.00));
        series5.getData().add(new XYChart.Data<>("2016-12-02", 1632.00));
        series5.getData().add(new XYChart.Data<>("2016-12-05", 1626.00));
        series5.getData().add(new XYChart.Data<>("2016-12-06", 1626.00));
        series5.getData().add(new XYChart.Data<>("2016-12-07", 1639.00));
        series5.getData().add(new XYChart.Data<>("2016-12-08", 1664.00));
        series5.getData().add(new XYChart.Data<>("2016-12-09", 1665.00));
        series5.getData().add(new XYChart.Data<>("2016-12-12", 1662.00));
        series5.getData().add(new XYChart.Data<>("2016-12-13", 1637.00));
        series5.getData().add(new XYChart.Data<>("2016-12-14", 1615.00));
        series5.getData().add(new XYChart.Data<>("2016-12-15", 1667.00));
        series5.getData().add(new XYChart.Data<>("2016-12-16", 1659.00));
        series5.getData().add(new XYChart.Data<>("2016-12-19", 1668.00));
        series5.getData().add(new XYChart.Data<>("2016-12-20", 1663.00));
        series5.getData().add(new XYChart.Data<>("2016-12-21", 1684.00));
        series5.getData().add(new XYChart.Data<>("2016-12-22", 1705.00));
        series5.getData().add(new XYChart.Data<>("2016-12-23", 1716.00));
        series5.getData().add(new XYChart.Data<>("2016-12-26", 1716.00));
        series5.getData().add(new XYChart.Data<>("2016-12-27", 1716.00));
        series5.getData().add(new XYChart.Data<>("2016-12-28", 1714.00));
        series5.getData().add(new XYChart.Data<>("2016-12-29", 1732.00));
        series5.getData().add(new XYChart.Data<>("2016-12-30", 1770.00));
        series5.getData().add(new XYChart.Data<>("2017-01-02", 1770.00));
        series5.getData().add(new XYChart.Data<>("2017-01-03", 1773.00));
        series5.getData().add(new XYChart.Data<>("2017-01-04", 1782.00));
        series5.getData().add(new XYChart.Data<>("2017-01-05", 1769.00));
        series5.getData().add(new XYChart.Data<>("2017-01-06", 1789.00));
        series5.getData().add(new XYChart.Data<>("2017-01-09", 1810.00));
        series5.getData().add(new XYChart.Data<>("2017-01-10", 1783.00));
        series5.getData().add(new XYChart.Data<>("2017-01-11", 1779.00));
        series5.getData().add(new XYChart.Data<>("2017-01-12", 1794.00));
        series5.getData().add(new XYChart.Data<>("2017-01-13", 1802.00));
        series5.getData().add(new XYChart.Data<>("2017-01-16", 1798.00));
        series5.getData().add(new XYChart.Data<>("2017-01-17", 1780.00));
        series5.getData().add(new XYChart.Data<>("2017-01-18", 1806.00));
        series5.getData().add(new XYChart.Data<>("2017-01-19", 1813.00));
        series5.getData().add(new XYChart.Data<>("2017-01-20", 1821.00));
        series5.getData().add(new XYChart.Data<>("2017-01-23", 1810.00));
        series5.getData().add(new XYChart.Data<>("2017-01-24", 1816.00));
        series5.getData().add(new XYChart.Data<>("2017-01-25", 1810.00));
        series5.getData().add(new XYChart.Data<>("2017-01-26", 1815.00));
        series5.getData().add(new XYChart.Data<>("2017-01-27", 1819.00));
        series5.getData().add(new XYChart.Data<>("2017-01-30", 1812.00));
        series5.getData().add(new XYChart.Data<>("2017-01-31", 1812.00));
        series5.getData().add(new XYChart.Data<>("2017-02-01", 1800.00));
        series5.getData().add(new XYChart.Data<>("2017-02-02", 1790.00));
        series5.getData().add(new XYChart.Data<>("2017-02-03", 1795.00));
        series5.getData().add(new XYChart.Data<>("2017-02-06", 1788.00));
        series5.getData().add(new XYChart.Data<>("2017-02-07", 1799.00));
        series5.getData().add(new XYChart.Data<>("2017-02-08", 1823.00));
        series5.getData().add(new XYChart.Data<>("2017-02-09", 1820.00));
        series5.getData().add(new XYChart.Data<>("2017-02-10", 1826.00)); 
        chart5.getData().add(series5);
        
        XYChart.Series<String, Number> series6 = new XYChart.Series<>();
        series6.setName("Series 1");        
        series6.getData().add(new XYChart.Data<>("2016-11-14", 3881.011)); 
        series6.getData().add(new XYChart.Data<>("2016-11-15", 3938.157));
        series6.getData().add(new XYChart.Data<>("2016-11-16", 3897.761));
        series6.getData().add(new XYChart.Data<>("2016-11-17", 3965.745));
        series6.getData().add(new XYChart.Data<>("2016-11-18", 4023.877));
        series6.getData().add(new XYChart.Data<>("2016-11-21", 3970.672)); 
        series6.getData().add(new XYChart.Data<>("2016-11-22", 4028.803));
        series6.getData().add(new XYChart.Data<>("2016-11-23", 4075.111));
        series6.getData().add(new XYChart.Data<>("2016-11-24", 4064.921));
        series6.getData().add(new XYChart.Data<>("2016-11-25", 4078.808));
        series6.getData().add(new XYChart.Data<>("2016-11-28", 4066.905));
        series6.getData().add(new XYChart.Data<>("2016-11-29", 4095.671));
        series6.getData().add(new XYChart.Data<>("2016-11-30", 4011.357));
        series6.getData().add(new XYChart.Data<>("2016-12-01", 3893.318));
        series6.getData().add(new XYChart.Data<>("2016-12-02", 3875.463)); 
        series6.getData().add(new XYChart.Data<>("2016-12-05", 4006.397)); 
        series6.getData().add(new XYChart.Data<>("2016-12-06", 3993.502)); 
        series6.getData().add(new XYChart.Data<>("2016-12-07", 4045.083)); 
        series6.getData().add(new XYChart.Data<>("2016-12-08", 4091.703));
        series6.getData().add(new XYChart.Data<>("2016-12-09", 4088.727));
        series6.getData().add(new XYChart.Data<>("2016-12-12", 3977.631));
        series6.getData().add(new XYChart.Data<>("2016-12-13", 3978.623));
        series6.getData().add(new XYChart.Data<>("2016-12-14", 4012.349));
        series6.getData().add(new XYChart.Data<>("2016-12-15", 4096.663));
        series6.getData().add(new XYChart.Data<>("2016-12-16", 4035.163));
        series6.getData().add(new XYChart.Data<>("2016-12-19", 3990.527));
        series6.getData().add(new XYChart.Data<>("2016-12-20", 4111.542));
        series6.getData().add(new XYChart.Data<>("2016-12-21", 4103.606));
        series6.getData().add(new XYChart.Data<>("2016-12-22", 4098.647));
        series6.getData().add(new XYChart.Data<>("2016-12-23", 4113.526));
        series6.getData().add(new XYChart.Data<>("2016-12-26", 4113.526));
        series6.getData().add(new XYChart.Data<>("2016-12-27", 4113.526));
        series6.getData().add(new XYChart.Data<>("2016-12-28", 4111.542));
        series6.getData().add(new XYChart.Data<>("2016-12-29", 4081.784));
        series6.getData().add(new XYChart.Data<>("2016-12-30", 4091.703));
        series6.getData().add(new XYChart.Data<>("2017-01-02", 4091.703));
        series6.getData().add(new XYChart.Data<>("2017-01-03", 4066.905));
        series6.getData().add(new XYChart.Data<>("2017-01-04", 4097.655));
        series6.getData().add(new XYChart.Data<>("2017-01-05", 4145.267));
        series6.getData().add(new XYChart.Data<>("2017-01-06", 4155.187));
        series6.getData().add(new XYChart.Data<>("2017-01-09", 4208.751));
        series6.getData().add(new XYChart.Data<>("2017-01-10", 4263.307));
        series6.getData().add(new XYChart.Data<>("2017-01-11", 4279.178)); 
        series6.getData().add(new XYChart.Data<>("2017-01-12", 4180.977)); 
        series6.getData().add(new XYChart.Data<>("2017-01-13", 4207.759)); 
        series6.getData().add(new XYChart.Data<>("2017-01-16", 4227.597)); 
        series6.getData().add(new XYChart.Data<>("2017-01-17", 4079.80)); 
        series6.getData().add(new XYChart.Data<>("2017-01-18", 4138.324)); 
        series6.getData().add(new XYChart.Data<>("2017-01-19", 4146.259)); 
        series6.getData().add(new XYChart.Data<>("2017-01-20", 4134.356)); 
        series6.getData().add(new XYChart.Data<>("2017-01-23", 4071.865)); 
        series6.getData().add(new XYChart.Data<>("2017-01-24", 4141.30)); 
        series6.getData().add(new XYChart.Data<>("2017-01-25", 4198.831)); 
        series6.getData().add(new XYChart.Data<>("2017-01-26", 4304.968)); 
        series6.getData().add(new XYChart.Data<>("2017-01-27", 4304.968)); 
        series6.getData().add(new XYChart.Data<>("2017-01-30", 4289.097)); 
        series6.getData().add(new XYChart.Data<>("2017-01-31", 4203.791)); 
        series6.getData().add(new XYChart.Data<>("2017-02-01", 4208.751)); 
        series6.getData().add(new XYChart.Data<>("2017-02-02", 4233.549)); 
        series6.getData().add(new XYChart.Data<>("2017-02-03", 4253.387)); 
        series6.getData().add(new XYChart.Data<>("2017-02-06", 4276.202)); 
        series6.getData().add(new XYChart.Data<>("2017-02-07", 4267.274)); 
        series6.getData().add(new XYChart.Data<>("2017-02-08", 4273.226)); 
        series6.getData().add(new XYChart.Data<>("2017-02-09", 4263.307)); 
        series6.getData().add(new XYChart.Data<>("2017-02-10", 4301.00)); 
        chart6.getData().add(series6);
        
        XYChart.Series<String, Number> series7 = new XYChart.Series<>();
        series7.setName("Series 1");
        series7.getData().add(new XYChart.Data<>("2016-11-14", 200.30)); 
        series7.getData().add(new XYChart.Data<>("2016-11-15", 204.00)); 
        series7.getData().add(new XYChart.Data<>("2016-11-16", 199.30)); 
        series7.getData().add(new XYChart.Data<>("2016-11-17", 202.00)); 
        series7.getData().add(new XYChart.Data<>("2016-11-18", 199.60)); 
        series7.getData().add(new XYChart.Data<>("2016-11-21", 195.20)); 
        series7.getData().add(new XYChart.Data<>("2016-11-22", 202.50)); 
        series7.getData().add(new XYChart.Data<>("2016-11-23", 202.90)); 
        series7.getData().add(new XYChart.Data<>("2016-11-24", 202.20)); 
        series7.getData().add(new XYChart.Data<>("2016-11-25", 204.10)); 
        series7.getData().add(new XYChart.Data<>("2016-11-28", 209.40)); 
        series7.getData().add(new XYChart.Data<>("2016-11-29", 209.80)); 
        series7.getData().add(new XYChart.Data<>("2016-11-30", 210.30)); 
        series7.getData().add(new XYChart.Data<>("2016-12-01", 209.30)); 
        series7.getData().add(new XYChart.Data<>("2016-12-02", 208.20)); 
        series7.getData().add(new XYChart.Data<>("2016-12-05", 206.40)); 
        series7.getData().add(new XYChart.Data<>("2016-12-06", 209.70)); 
        series7.getData().add(new XYChart.Data<>("2016-12-07", 213.10)); 
        series7.getData().add(new XYChart.Data<>("2016-12-08", 215.00)); 
        series7.getData().add(new XYChart.Data<>("2016-12-09", 217.00)); 
        series7.getData().add(new XYChart.Data<>("2016-12-12", 217.30)); 
        series7.getData().add(new XYChart.Data<>("2016-12-13", 221.10)); 
        series7.getData().add(new XYChart.Data<>("2016-12-14", 218.90)); 
        series7.getData().add(new XYChart.Data<>("2016-12-15", 231.20)); 
        series7.getData().add(new XYChart.Data<>("2016-12-16", 230.10)); 
        series7.getData().add(new XYChart.Data<>("2016-12-19", 230.20)); 
        series7.getData().add(new XYChart.Data<>("2016-12-20", 230.80)); 
        series7.getData().add(new XYChart.Data<>("2016-12-21", 229.80)); 
        series7.getData().add(new XYChart.Data<>("2016-12-22", 229.70)); 
        series7.getData().add(new XYChart.Data<>("2016-12-23", 230.50)); 
        series7.getData().add(new XYChart.Data<>("2016-12-26", 230.50)); 
        series7.getData().add(new XYChart.Data<>("2016-12-27", 230.50)); 
        series7.getData().add(new XYChart.Data<>("2016-12-28", 231.50)); 
        series7.getData().add(new XYChart.Data<>("2016-12-29", 233.00)); 
        series7.getData().add(new XYChart.Data<>("2016-12-30", 234.10)); 
        series7.getData().add(new XYChart.Data<>("2017-01-02", 234.10)); 
        series7.getData().add(new XYChart.Data<>("2017-01-03", 235.50)); 
        series7.getData().add(new XYChart.Data<>("2017-01-04", 232.90)); 
        series7.getData().add(new XYChart.Data<>("2017-01-05", 233.20)); 
        series7.getData().add(new XYChart.Data<>("2017-01-06", 233.50));
        series7.getData().add(new XYChart.Data<>("2017-01-09", 230.40)); 
        series7.getData().add(new XYChart.Data<>("2017-01-10", 226.80)); 
        series7.getData().add(new XYChart.Data<>("2017-01-11", 225.50)); 
        series7.getData().add(new XYChart.Data<>("2017-01-12", 227.00)); 
        series7.getData().add(new XYChart.Data<>("2017-01-13", 230.20)); 
        series7.getData().add(new XYChart.Data<>("2017-01-16", 230.50)); 
        series7.getData().add(new XYChart.Data<>("2017-01-17", 229.10)); 
        series7.getData().add(new XYChart.Data<>("2017-01-18", 229.20)); 
        series7.getData().add(new XYChart.Data<>("2017-01-19", 229.80)); 
        series7.getData().add(new XYChart.Data<>("2017-01-20", 228.00)); 
        series7.getData().add(new XYChart.Data<>("2017-01-23", 227.10)); 
        series7.getData().add(new XYChart.Data<>("2017-01-24", 225.40)); 
        series7.getData().add(new XYChart.Data<>("2017-01-25", 226.00)); 
        series7.getData().add(new XYChart.Data<>("2017-01-26", 227.10)); 
        series7.getData().add(new XYChart.Data<>("2017-01-27", 227.00)); 
        series7.getData().add(new XYChart.Data<>("2017-01-30", 225.60)); 
        series7.getData().add(new XYChart.Data<>("2017-01-31", 224.30)); 
        series7.getData().add(new XYChart.Data<>("2017-02-01", 223.70)); 
        series7.getData().add(new XYChart.Data<>("2017-02-02", 225.50)); 
        series7.getData().add(new XYChart.Data<>("2017-02-03", 226.80)); 
        series7.getData().add(new XYChart.Data<>("2017-02-06", 225.80)); 
        series7.getData().add(new XYChart.Data<>("2017-02-07", 229.10)); 
        series7.getData().add(new XYChart.Data<>("2017-02-08", 230.00)); 
        series7.getData().add(new XYChart.Data<>("2017-02-09", 232.60)); 
        series7.getData().add(new XYChart.Data<>("2017-02-10", 234.00)); 
        chart7.getData().add(series7);      
    
        XYChart.Series<String, Number> series8 = new XYChart.Series<>();
        series8.setName("Series 1");
        series8.getData().add(new XYChart.Data<>("2016-11-14", 1307.677)); 
        series8.getData().add(new XYChart.Data<>("2016-11-15", 1328.371)); 
        series8.getData().add(new XYChart.Data<>("2016-11-16", 1337.24)); 
        series8.getData().add(new XYChart.Data<>("2016-11-17", 1336.254)); 
        series8.getData().add(new XYChart.Data<>("2016-11-18", 1360.89)); 
        series8.getData().add(new XYChart.Data<>("2016-11-21", 1370.745)); 
        series8.getData().add(new XYChart.Data<>("2016-11-22", 1306.691)); 
        series8.getData().add(new XYChart.Data<>("2016-11-23", 1335.269)); 
        series8.getData().add(new XYChart.Data<>("2016-11-24", 1346.109)); 
        series8.getData().add(new XYChart.Data<>("2016-11-25", 1354.978)); 
        series8.getData().add(new XYChart.Data<>("2016-11-28", 1359.905)); 
        series8.getData().add(new XYChart.Data<>("2016-11-29", 1371.73)); 
        series8.getData().add(new XYChart.Data<>("2016-11-30", 1351.036)); 
        series8.getData().add(new XYChart.Data<>("2016-12-01", 1309.647)); 
        series8.getData().add(new XYChart.Data<>("2016-12-02", 1321.473)); 
        series8.getData().add(new XYChart.Data<>("2016-12-05", 1302.749)); 
        series8.getData().add(new XYChart.Data<>("2016-12-06", 1298.808)); 
        series8.getData().add(new XYChart.Data<>("2016-12-07", 1313.589)); 
        series8.getData().add(new XYChart.Data<>("2016-12-08", 1334.283)); 
        series8.getData().add(new XYChart.Data<>("2016-12-09", 1356.948)); 
        series8.getData().add(new XYChart.Data<>("2016-12-12", 1333.298)); 
        series8.getData().add(new XYChart.Data<>("2016-12-13", 1368.774)); 
        series8.getData().add(new XYChart.Data<>("2016-12-14", 1357.934)); 
        series8.getData().add(new XYChart.Data<>("2016-12-15", 1389.468)); 
        series8.getData().add(new XYChart.Data<>("2016-12-16", 1394.395)); 
        series8.getData().add(new XYChart.Data<>("2016-12-19", 1410.162)); 
        series8.getData().add(new XYChart.Data<>("2016-12-20", 1414.104)); 
        series8.getData().add(new XYChart.Data<>("2016-12-21", 1422.973)); 
        series8.getData().add(new XYChart.Data<>("2016-12-22", 1435.783)); 
        series8.getData().add(new XYChart.Data<>("2016-12-23", 1434.798)); 
        series8.getData().add(new XYChart.Data<>("2016-12-26", 1434.798)); 
        series8.getData().add(new XYChart.Data<>("2016-12-27", 1434.798)); 
        series8.getData().add(new XYChart.Data<>("2016-12-28", 1448.594)); 
        series8.getData().add(new XYChart.Data<>("2016-12-29", 1458.449)); 
        series8.getData().add(new XYChart.Data<>("2016-12-30", 1479.143)); 
        series8.getData().add(new XYChart.Data<>("2017-01-02", 1479.143)); 
        series8.getData().add(new XYChart.Data<>("2017-01-03", 1454.507)); 
        series8.getData().add(new XYChart.Data<>("2017-01-04", 1451.551)); 
        series8.getData().add(new XYChart.Data<>("2017-01-05", 1439.725)); 
        series8.getData().add(new XYChart.Data<>("2017-01-06", 1436.769)); 
        series8.getData().add(new XYChart.Data<>("2017-01-09", 1434.798)); 
        series8.getData().add(new XYChart.Data<>("2017-01-10", 1442.682)); 
        series8.getData().add(new XYChart.Data<>("2017-01-11", 1436.769)); 
        series8.getData().add(new XYChart.Data<>("2017-01-12", 1444.652)); 
        series8.getData().add(new XYChart.Data<>("2017-01-13", 1438.74)); 
        series8.getData().add(new XYChart.Data<>("2017-01-16", 1443.667)); 
        series8.getData().add(new XYChart.Data<>("2017-01-17", 1404.249)); 
        series8.getData().add(new XYChart.Data<>("2017-01-18", 1427.90)); 
        series8.getData().add(new XYChart.Data<>("2017-01-19", 1416.00)); 
        series8.getData().add(new XYChart.Data<>("2017-01-20", 1408.00)); 
        series8.getData().add(new XYChart.Data<>("2017-01-23", 1406.00)); 
        series8.getData().add(new XYChart.Data<>("2017-01-24", 1412.00)); 
        series8.getData().add(new XYChart.Data<>("2017-01-25", 1402.00)); 
        series8.getData().add(new XYChart.Data<>("2017-01-26", 1392.00)); 
        series8.getData().add(new XYChart.Data<>("2017-01-27", 1417.00)); 
        series8.getData().add(new XYChart.Data<>("2017-01-30", 1407.00)); 
        series8.getData().add(new XYChart.Data<>("2017-01-31", 1412.00)); 
        series8.getData().add(new XYChart.Data<>("2017-02-01", 1397.00)); 
        series8.getData().add(new XYChart.Data<>("2017-02-02", 1439.00)); 
        series8.getData().add(new XYChart.Data<>("2017-02-03", 1444.00)); 
        series8.getData().add(new XYChart.Data<>("2017-02-06", 1429.00)); 
        series8.getData().add(new XYChart.Data<>("2017-02-07", 1438.00)); 
        series8.getData().add(new XYChart.Data<>("2017-02-08", 1450.00)); 
        series8.getData().add(new XYChart.Data<>("2017-02-09", 1441.00)); 
        series8.getData().add(new XYChart.Data<>("2017-02-10", 1445.00)); 
        chart8.getData().add(series8);
        
        XYChart.Series<String, Number> series9 = new XYChart.Series<>();
        series9.setName("Series 1");
        series9.getData().add(new XYChart.Data<>("2016-11-14", 1373.722)); 
        series9.getData().add(new XYChart.Data<>("2016-11-15", 1386.635)); 
        series9.getData().add(new XYChart.Data<>("2016-11-16", 1392.594)); 
        series9.getData().add(new XYChart.Data<>("2016-11-17", 1415.44)); 
        series9.getData().add(new XYChart.Data<>("2016-11-18", 1420.407)); 
        series9.getData().add(new XYChart.Data<>("2016-11-21", 1439.279)); 
        series9.getData().add(new XYChart.Data<>("2016-11-22", 1442.259)); 
        series9.getData().add(new XYChart.Data<>("2016-11-23", 1447.225)); 
        series9.getData().add(new XYChart.Data<>("2016-11-24", 1452.192)); 
        series9.getData().add(new XYChart.Data<>("2016-11-25", 1467.091)); 
        series9.getData().add(new XYChart.Data<>("2016-11-28", 1480.004)); 
        series9.getData().add(new XYChart.Data<>("2016-11-29", 1489.937)); 
        series9.getData().add(new XYChart.Data<>("2016-11-30", 1499.87)); 
        series9.getData().add(new XYChart.Data<>("2016-12-01", 1489.937)); 
        series9.getData().add(new XYChart.Data<>("2016-12-02", 1501.856)); 
        series9.getData().add(new XYChart.Data<>("2016-12-05", 1483.977)); 
        series9.getData().add(new XYChart.Data<>("2016-12-06", 1478.017)); 
        series9.getData().add(new XYChart.Data<>("2016-12-07", 1494.903)); 
        series9.getData().add(new XYChart.Data<>("2016-12-08", 1485.964)); 
        series9.getData().add(new XYChart.Data<>("2016-12-09", 1496.89)); 
        series9.getData().add(new XYChart.Data<>("2016-12-12", 1479.011)); 
        series9.getData().add(new XYChart.Data<>("2016-12-13", 1489.937)); 
        series9.getData().add(new XYChart.Data<>("2016-12-14", 1490.93)); 
        series9.getData().add(new XYChart.Data<>("2016-12-15", 1488.944)); 
        series9.getData().add(new XYChart.Data<>("2016-12-16", 1501.856)); 
        series9.getData().add(new XYChart.Data<>("2016-12-19", 1506.823)); 
        series9.getData().add(new XYChart.Data<>("2016-12-20", 1498.877)); 
        series9.getData().add(new XYChart.Data<>("2016-12-21", 1514.769)); 
        series9.getData().add(new XYChart.Data<>("2016-12-22", 1534.635)); 
        series9.getData().add(new XYChart.Data<>("2016-12-23", 1542.581)); 
        series9.getData().add(new XYChart.Data<>("2016-12-26", 1542.581)); 
        series9.getData().add(new XYChart.Data<>("2016-12-27", 1542.581)); 
        series9.getData().add(new XYChart.Data<>("2016-12-28", 1562.447)); 
        series9.getData().add(new XYChart.Data<>("2016-12-29", 1575.00)); 
        series9.getData().add(new XYChart.Data<>("2016-12-30", 1574.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-02", 1574.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-03", 1586.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-04", 1580.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-05", 1569.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-06", 1569.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-09", 1579.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-10", 1579.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-11", 1583.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-12", 1597.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-13", 1601.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-16", 1612.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-17", 1578.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-18", 1551.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-19", 1534.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-20", 1539.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-23", 1534.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-24", 1539.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-25", 1545.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-26", 1532.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-27", 1549.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-30", 1547.00)); 
        series9.getData().add(new XYChart.Data<>("2017-01-31", 1529.00)); 
        series9.getData().add(new XYChart.Data<>("2017-02-01", 1532.00)); 
        series9.getData().add(new XYChart.Data<>("2017-02-02", 1553.00)); 
        series9.getData().add(new XYChart.Data<>("2017-02-03", 1555.00)); 
        series9.getData().add(new XYChart.Data<>("2017-02-06", 1558.00)); 
        series9.getData().add(new XYChart.Data<>("2017-02-07", 1560.00)); 
        series9.getData().add(new XYChart.Data<>("2017-02-08", 1560.00)); 
        series9.getData().add(new XYChart.Data<>("2017-02-09", 1564.00)); 
        series9.getData().add(new XYChart.Data<>("2017-02-10", 1565.00));
        chart9.getData().add(series9);
        
        XYChart.Series<String, Number> series10 = new XYChart.Series<>();
        series10.setName("Series 1");
        series10.getData().add(new XYChart.Data<>("2016-11-14", 973.402));
        series10.getData().add(new XYChart.Data<>("2016-11-15", 1025.279));
        series10.getData().add(new XYChart.Data<>("2016-11-16", 999.812));
        series10.getData().add(new XYChart.Data<>("2016-11-17", 1020.563));
        series10.getData().add(new XYChart.Data<>("2016-11-18", 1010.188));
        series10.getData().add(new XYChart.Data<>("2016-11-21", 1006.415));
        series10.getData().add(new XYChart.Data<>("2016-11-22", 1004.528));
        series10.getData().add(new XYChart.Data<>("2016-11-23", 986.607));
        series10.getData().add(new XYChart.Data<>("2016-11-24", 963.97));
        series10.getData().add(new XYChart.Data<>("2016-11-25", 962.083));
        series10.getData().add(new XYChart.Data<>("2016-11-28", 947.935));
        series10.getData().add(new XYChart.Data<>("2016-11-29", 953.594));
        series10.getData().add(new XYChart.Data<>("2016-11-30", 933.787));
        series10.getData().add(new XYChart.Data<>("2016-12-01", 939.918));
        series10.getData().add(new XYChart.Data<>("2016-12-02", 915.394));
        series10.getData().add(new XYChart.Data<>("2016-12-05", 919.167));
        series10.getData().add(new XYChart.Data<>("2016-12-06", 924.826));
        series10.getData().add(new XYChart.Data<>("2016-12-07", 937.088));
        series10.getData().add(new XYChart.Data<>("2016-12-08", 949.822));
        series10.getData().add(new XYChart.Data<>("2016-12-09", 940.389));
        series10.getData().add(new XYChart.Data<>("2016-12-12", 914.922));
        series10.getData().add(new XYChart.Data<>("2016-12-13", 932.844));
        series10.getData().add(new XYChart.Data<>("2016-12-14", 924.826));
        series10.getData().add(new XYChart.Data<>("2016-12-15", 949.822));
        series10.getData().add(new XYChart.Data<>("2016-12-16", 983.777));
        series10.getData().add(new XYChart.Data<>("2016-12-19", 975.288));
        series10.getData().add(new XYChart.Data<>("2016-12-20", 969.629));
        series10.getData().add(new XYChart.Data<>("2016-12-21", 969.629));
        series10.getData().add(new XYChart.Data<>("2016-12-22", 967.743));
        series10.getData().add(new XYChart.Data<>("2016-12-23", 976.232));
        series10.getData().add(new XYChart.Data<>("2016-12-26", 976.232));
        series10.getData().add(new XYChart.Data<>("2016-12-27", 976.232));
        series10.getData().add(new XYChart.Data<>("2016-12-28", 956.424));
        series10.getData().add(new XYChart.Data<>("2016-12-29", 945.105));
        series10.getData().add(new XYChart.Data<>("2016-12-30", 947.935));
        series10.getData().add(new XYChart.Data<>("2017-01-02", 947.935));
        series10.getData().add(new XYChart.Data<>("2017-01-03", 933.315));
        series10.getData().add(new XYChart.Data<>("2017-01-04", 951.708));
        series10.getData().add(new XYChart.Data<>("2017-01-05", 995.096));
        series10.getData().add(new XYChart.Data<>("2017-01-06", 998.869));
        series10.getData().add(new XYChart.Data<>("2017-01-09", 992.266));
        series10.getData().add(new XYChart.Data<>("2017-01-10", 1017.733));
        series10.getData().add(new XYChart.Data<>("2017-01-11", 995.096));
        series10.getData().add(new XYChart.Data<>("2017-01-12", 977.175));
        series10.getData().add(new XYChart.Data<>("2017-01-13", 977.175));
        series10.getData().add(new XYChart.Data<>("2017-01-16", 964.913));
        series10.getData().add(new XYChart.Data<>("2017-01-17", 997.926));
        series10.getData().add(new XYChart.Data<>("2017-01-18", 991.323));
        series10.getData().add(new XYChart.Data<>("2017-01-19", 981.891));
        series10.getData().add(new XYChart.Data<>("2017-01-20", 984.721));
        series10.getData().add(new XYChart.Data<>("2017-01-23", 1014.904));
        series10.getData().add(new XYChart.Data<>("2017-01-24", 925.298));
        series10.getData().add(new XYChart.Data<>("2017-01-25", 950.765));
        series10.getData().add(new XYChart.Data<>("2017-01-26", 938.503));
        series10.getData().add(new XYChart.Data<>("2017-01-27", 918.695));
        series10.getData().add(new XYChart.Data<>("2017-01-30", 908.32));
        series10.getData().add(new XYChart.Data<>("2017-01-31", 896.058));
        series10.getData().add(new XYChart.Data<>("2017-02-01", 888.984));
        series10.getData().add(new XYChart.Data<>("2017-02-02", 881.91));
        series10.getData().add(new XYChart.Data<>("2017-02-03", 886.626));
        series10.getData().add(new XYChart.Data<>("2017-02-06", 879.552));
        series10.getData().add(new XYChart.Data<>("2017-02-07", 870.591));
        series10.getData().add(new XYChart.Data<>("2017-02-08", 880.495));
        series10.getData().add(new XYChart.Data<>("2017-02-09", 896.058));
        series10.getData().add(new XYChart.Data<>("2017-02-10", 893.70));
        chart10.getData().add(series10);
        
        XYChart.Series<String, Number> series11 = new XYChart.Series<>();
        series11.setName("Series 1");
        series11.getData().add(new XYChart.Data<>("2016-11-14", 304.40));
        series11.getData().add(new XYChart.Data<>("2016-11-15", 307.10));
        series11.getData().add(new XYChart.Data<>("2016-11-16", 304.80));
        series11.getData().add(new XYChart.Data<>("2016-11-17", 307.20));
        series11.getData().add(new XYChart.Data<>("2016-11-18", 304.30));
        series11.getData().add(new XYChart.Data<>("2016-11-21", 309.10));
        series11.getData().add(new XYChart.Data<>("2016-11-22", 309.60));
        series11.getData().add(new XYChart.Data<>("2016-11-23", 311.60));
        series11.getData().add(new XYChart.Data<>("2016-11-24", 310.50));
        series11.getData().add(new XYChart.Data<>("2016-11-25", 308.90));
        series11.getData().add(new XYChart.Data<>("2016-11-28", 308.60));
        series11.getData().add(new XYChart.Data<>("2016-11-29", 308.40));
        series11.getData().add(new XYChart.Data<>("2016-11-30", 309.90));
        series11.getData().add(new XYChart.Data<>("2016-12-01", 306.20));
        series11.getData().add(new XYChart.Data<>("2016-12-02", 303.10));
        series11.getData().add(new XYChart.Data<>("2016-12-05", 307.40));
        series11.getData().add(new XYChart.Data<>("2016-12-06", 304.70));
        series11.getData().add(new XYChart.Data<>("2016-12-07", 318.40));
        series11.getData().add(new XYChart.Data<>("2016-12-08", 316.80));
        series11.getData().add(new XYChart.Data<>("2016-12-09", 316.20));
        series11.getData().add(new XYChart.Data<>("2016-12-12", 312.10));
        series11.getData().add(new XYChart.Data<>("2016-12-13", 319.50));
        series11.getData().add(new XYChart.Data<>("2016-12-14", 319.40));
        series11.getData().add(new XYChart.Data<>("2016-12-15", 330.90));
        series11.getData().add(new XYChart.Data<>("2016-12-16", 329.80));
        series11.getData().add(new XYChart.Data<>("2016-12-19", 329.00));
        series11.getData().add(new XYChart.Data<>("2016-12-20", 328.80));
        series11.getData().add(new XYChart.Data<>("2016-12-21", 329.50));
        series11.getData().add(new XYChart.Data<>("2016-12-22", 330.80));
        series11.getData().add(new XYChart.Data<>("2016-12-23", 330.50));
        series11.getData().add(new XYChart.Data<>("2016-12-26", 330.50));
        series11.getData().add(new XYChart.Data<>("2016-12-27", 330.50));
        series11.getData().add(new XYChart.Data<>("2016-12-28", 330.10));
        series11.getData().add(new XYChart.Data<>("2016-12-29", 329.10));
        series11.getData().add(new XYChart.Data<>("2016-12-30", 331.70));
        series11.getData().add(new XYChart.Data<>("2017-01-02", 331.70));
        series11.getData().add(new XYChart.Data<>("2017-01-03", 333.10));
        series11.getData().add(new XYChart.Data<>("2017-01-04", 331.90));
        series11.getData().add(new XYChart.Data<>("2017-01-05", 332.40));
        series11.getData().add(new XYChart.Data<>("2017-01-06", 331.40));
        series11.getData().add(new XYChart.Data<>("2017-01-09", 330.50));
        series11.getData().add(new XYChart.Data<>("2017-01-10", 334.80));
        series11.getData().add(new XYChart.Data<>("2017-01-11", 334.90));
        series11.getData().add(new XYChart.Data<>("2017-01-12", 338.90));
        series11.getData().add(new XYChart.Data<>("2017-01-13", 341.30));
        series11.getData().add(new XYChart.Data<>("2017-01-16", 341.50));
        series11.getData().add(new XYChart.Data<>("2017-01-17", 338.50));
        series11.getData().add(new XYChart.Data<>("2017-01-18", 339.50));
        series11.getData().add(new XYChart.Data<>("2017-01-19", 342.00));
        series11.getData().add(new XYChart.Data<>("2017-01-20", 343.00));
        series11.getData().add(new XYChart.Data<>("2017-01-23", 340.90));
        series11.getData().add(new XYChart.Data<>("2017-01-24", 345.40));
        series11.getData().add(new XYChart.Data<>("2017-01-25", 351.30));
        series11.getData().add(new XYChart.Data<>("2017-01-26", 350.20));
        series11.getData().add(new XYChart.Data<>("2017-01-27", 348.50));
        series11.getData().add(new XYChart.Data<>("2017-01-30", 345.00));
        series11.getData().add(new XYChart.Data<>("2017-01-31", 343.40));
        series11.getData().add(new XYChart.Data<>("2017-02-01", 346.60));
        series11.getData().add(new XYChart.Data<>("2017-02-02", 346.30));
        series11.getData().add(new XYChart.Data<>("2017-02-03", 347.10));
        series11.getData().add(new XYChart.Data<>("2017-02-06", 343.90));
        series11.getData().add(new XYChart.Data<>("2017-02-07", 343.80));
        series11.getData().add(new XYChart.Data<>("2017-02-08", 344.50));
        series11.getData().add(new XYChart.Data<>("2017-02-09", 341.80));
        series11.getData().add(new XYChart.Data<>("2017-02-10", 340.90));
        chart11.getData().add(series11);

        XYChart.Series<String, Number> series12 = new XYChart.Series<>();
        series12.setName("Series 1");        
        series12.getData().add(new XYChart.Data<>("2016-11-14", 736.767));
        series12.getData().add(new XYChart.Data<>("2016-11-15", 745.728));
        series12.getData().add(new XYChart.Data<>("2016-11-16", 744.234));
        series12.getData().add(new XYChart.Data<>("2016-11-17", 753.693));
        series12.getData().add(new XYChart.Data<>("2016-11-18", 751.204));
        series12.getData().add(new XYChart.Data<>("2016-11-21", 743.737));
        series12.getData().add(new XYChart.Data<>("2016-11-22", 727.309));
        series12.getData().add(new XYChart.Data<>("2016-11-23", 729.30));
        series12.getData().add(new XYChart.Data<>("2016-11-24", 724.00));
        series12.getData().add(new XYChart.Data<>("2016-11-25", 732.50));
        series12.getData().add(new XYChart.Data<>("2016-11-28", 722.50));
        series12.getData().add(new XYChart.Data<>("2016-11-29", 702.50));
        series12.getData().add(new XYChart.Data<>("2016-11-30", 709.50));
        series12.getData().add(new XYChart.Data<>("2016-12-01", 690.50));
        series12.getData().add(new XYChart.Data<>("2016-12-02", 685.00));
        series12.getData().add(new XYChart.Data<>("2016-12-05", 691.50));
        series12.getData().add(new XYChart.Data<>("2016-12-06", 698.00));
        series12.getData().add(new XYChart.Data<>("2016-12-07", 709.00));
        series12.getData().add(new XYChart.Data<>("2016-12-08", 704.50));
        series12.getData().add(new XYChart.Data<>("2016-12-09", 737.00));
        series12.getData().add(new XYChart.Data<>("2016-12-12", 729.00));
        series12.getData().add(new XYChart.Data<>("2016-12-13", 744.00));
        series12.getData().add(new XYChart.Data<>("2016-12-14", 744.50));
        series12.getData().add(new XYChart.Data<>("2016-12-15", 724.00));
        series12.getData().add(new XYChart.Data<>("2016-12-16", 725.00));
        series12.getData().add(new XYChart.Data<>("2016-12-19", 738.50));
        series12.getData().add(new XYChart.Data<>("2016-12-20", 753.00));
        series12.getData().add(new XYChart.Data<>("2016-12-21", 751.50));
        series12.getData().add(new XYChart.Data<>("2016-12-22", 747.00));
        series12.getData().add(new XYChart.Data<>("2016-12-23", 752.00));
        series12.getData().add(new XYChart.Data<>("2016-12-26", 752.00));
        series12.getData().add(new XYChart.Data<>("2016-12-27", 752.00));
        series12.getData().add(new XYChart.Data<>("2016-12-28", 762.50));
        series12.getData().add(new XYChart.Data<>("2016-12-29", 773.00));
        series12.getData().add(new XYChart.Data<>("2016-12-30", 771.00));
        series12.getData().add(new XYChart.Data<>("2017-01-02", 771.00));
        series12.getData().add(new XYChart.Data<>("2017-01-03", 768.50));
        series12.getData().add(new XYChart.Data<>("2017-01-04", 772.00));
        series12.getData().add(new XYChart.Data<>("2017-01-05", 779.00));
        series12.getData().add(new XYChart.Data<>("2017-01-06", 786.50));
        series12.getData().add(new XYChart.Data<>("2017-01-09", 781.50));
        series12.getData().add(new XYChart.Data<>("2017-01-10", 786.50));
        series12.getData().add(new XYChart.Data<>("2017-01-11", 785.50));
        series12.getData().add(new XYChart.Data<>("2017-01-12", 791.00));
        series12.getData().add(new XYChart.Data<>("2017-01-13", 792.00));
        series12.getData().add(new XYChart.Data<>("2017-01-16", 806.00));
        series12.getData().add(new XYChart.Data<>("2017-01-17", 796.50));
        series12.getData().add(new XYChart.Data<>("2017-01-18", 797.50));
        series12.getData().add(new XYChart.Data<>("2017-01-19", 793.00));
        series12.getData().add(new XYChart.Data<>("2017-01-20", 789.50));
        series12.getData().add(new XYChart.Data<>("2017-01-23", 786.00));
        series12.getData().add(new XYChart.Data<>("2017-01-24", 797.50));
        series12.getData().add(new XYChart.Data<>("2017-01-25", 802.00));
        series12.getData().add(new XYChart.Data<>("2017-01-26", 807.00));
        series12.getData().add(new XYChart.Data<>("2017-01-27", 810.50));
        series12.getData().add(new XYChart.Data<>("2017-01-30", 788.00));
        series12.getData().add(new XYChart.Data<>("2017-01-31", 785.00));
        series12.getData().add(new XYChart.Data<>("2017-02-01", 761.50));
        series12.getData().add(new XYChart.Data<>("2017-02-02", 765.00));
        series12.getData().add(new XYChart.Data<>("2017-02-03", 788.50));
        series12.getData().add(new XYChart.Data<>("2017-02-06", 804.00));
        series12.getData().add(new XYChart.Data<>("2017-02-07", 801.50));
        series12.getData().add(new XYChart.Data<>("2017-02-08", 805.50));
        series12.getData().add(new XYChart.Data<>("2017-02-09", 825.50));
        series12.getData().add(new XYChart.Data<>("2017-02-10", 835.50));
        chart12.getData().add(series12);          
    
        XYChart.Series<String, Number> series13 = new XYChart.Series<>();
        series13.setName("Series 1"); 
        series13.getData().add(new XYChart.Data<>("2016-11-14", 2817.00));
        series13.getData().add(new XYChart.Data<>("2016-11-15", 2833.00));
        series13.getData().add(new XYChart.Data<>("2016-11-16", 2850.00));
        series13.getData().add(new XYChart.Data<>("2016-11-17", 2929.00));
        series13.getData().add(new XYChart.Data<>("2016-11-18", 2946.00));
        series13.getData().add(new XYChart.Data<>("2016-11-21", 2896.00));
        series13.getData().add(new XYChart.Data<>("2016-11-22", 2934.00));
        series13.getData().add(new XYChart.Data<>("2016-11-23", 2990.00));
        series13.getData().add(new XYChart.Data<>("2016-11-24", 2998.00));
        series13.getData().add(new XYChart.Data<>("2016-11-25", 2977.00));
        series13.getData().add(new XYChart.Data<>("2016-11-28", 2954.00));
        series13.getData().add(new XYChart.Data<>("2016-11-29", 2965.00));
        series13.getData().add(new XYChart.Data<>("2016-11-30", 2915.00));
        series13.getData().add(new XYChart.Data<>("2016-12-01", 2877.00));
        series13.getData().add(new XYChart.Data<>("2016-12-02", 2853.00));
        series13.getData().add(new XYChart.Data<>("2016-12-05", 2851.00));
        series13.getData().add(new XYChart.Data<>("2016-12-06", 2838.00));
        series13.getData().add(new XYChart.Data<>("2016-12-07", 2831.00));
        series13.getData().add(new XYChart.Data<>("2016-12-08", 2829.00));
        series13.getData().add(new XYChart.Data<>("2016-12-09", 2726.00));
        series13.getData().add(new XYChart.Data<>("2016-12-12", 2661.00));
        series13.getData().add(new XYChart.Data<>("2016-12-13", 2671.00));
        series13.getData().add(new XYChart.Data<>("2016-12-14", 2714.00));
        series13.getData().add(new XYChart.Data<>("2016-12-15", 2740.00));
        series13.getData().add(new XYChart.Data<>("2016-12-16", 2750.00));
        series13.getData().add(new XYChart.Data<>("2016-12-19", 2750.00));
        series13.getData().add(new XYChart.Data<>("2016-12-20", 2758.00));
        series13.getData().add(new XYChart.Data<>("2016-12-21", 2774.00));
        series13.getData().add(new XYChart.Data<>("2016-12-22", 2785.00));
        series13.getData().add(new XYChart.Data<>("2016-12-23", 2815.00));
        series13.getData().add(new XYChart.Data<>("2016-12-26", 2815.00));
        series13.getData().add(new XYChart.Data<>("2016-12-27", 2815.00));
        series13.getData().add(new XYChart.Data<>("2016-12-28", 2783.00));
        series13.getData().add(new XYChart.Data<>("2016-12-29", 2805.00));
        series13.getData().add(new XYChart.Data<>("2016-12-30", 2849.00));
        series13.getData().add(new XYChart.Data<>("2017-01-02", 2849.00));
        series13.getData().add(new XYChart.Data<>("2017-01-03", 2860.00));
        series13.getData().add(new XYChart.Data<>("2017-01-04", 2896.00));
        series13.getData().add(new XYChart.Data<>("2017-01-05", 2848.00));
        series13.getData().add(new XYChart.Data<>("2017-01-06", 2874.00));
        series13.getData().add(new XYChart.Data<>("2017-01-09", 2893.00));
        series13.getData().add(new XYChart.Data<>("2017-01-10", 2887.00));
        series13.getData().add(new XYChart.Data<>("2017-01-11", 2885.00));
        series13.getData().add(new XYChart.Data<>("2017-01-12", 2849.00));
        series13.getData().add(new XYChart.Data<>("2017-01-13", 2844.00));
        series13.getData().add(new XYChart.Data<>("2017-01-16", 2866.00));
        series13.getData().add(new XYChart.Data<>("2017-01-17", 2836.00));
        series13.getData().add(new XYChart.Data<>("2017-01-18", 2851.00));
        series13.getData().add(new XYChart.Data<>("2017-01-19", 2821.00));
        series13.getData().add(new XYChart.Data<>("2017-01-20", 2782.00));
        series13.getData().add(new XYChart.Data<>("2017-01-23", 2779.00));
        series13.getData().add(new XYChart.Data<>("2017-01-24", 2759.00));
        series13.getData().add(new XYChart.Data<>("2017-01-25", 2742.00));
        series13.getData().add(new XYChart.Data<>("2017-01-26", 2678.00));
        series13.getData().add(new XYChart.Data<>("2017-01-27", 2694.00));
        series13.getData().add(new XYChart.Data<>("2017-01-30", 2688.00));
        series13.getData().add(new XYChart.Data<>("2017-01-31", 2725.00));
        series13.getData().add(new XYChart.Data<>("2017-02-01", 2642.00));
        series13.getData().add(new XYChart.Data<>("2017-02-02", 2642.00));
        series13.getData().add(new XYChart.Data<>("2017-02-03", 2657.00));
        series13.getData().add(new XYChart.Data<>("2017-02-06", 2676.00));
        series13.getData().add(new XYChart.Data<>("2017-02-07", 2723.00));
        series13.getData().add(new XYChart.Data<>("2017-02-08", 2719.00));
        series13.getData().add(new XYChart.Data<>("2017-02-09", 2773.00));
        series13.getData().add(new XYChart.Data<>("2017-02-10", 2779.00));
        chart13.getData().add(series13);
        
        XYChart.Series<String, Number> series14 = new XYChart.Series<>();
        series14.setName("Series 1"); 
        series14.getData().add(new XYChart.Data<>("2016-11-14", 8830.00));
        series14.getData().add(new XYChart.Data<>("2016-11-15", 8660.00));
        series14.getData().add(new XYChart.Data<>("2016-11-16", 8635.00));
        series14.getData().add(new XYChart.Data<>("2016-11-17", 8610.00));
        series14.getData().add(new XYChart.Data<>("2016-11-18", 8775.00));
        series14.getData().add(new XYChart.Data<>("2016-11-21", 8610.00));
        series14.getData().add(new XYChart.Data<>("2016-11-22", 8615.00));
        series14.getData().add(new XYChart.Data<>("2016-11-23", 8640.00));
        series14.getData().add(new XYChart.Data<>("2016-11-24", 8720.00));
        series14.getData().add(new XYChart.Data<>("2016-11-25", 8605.00));
        series14.getData().add(new XYChart.Data<>("2016-11-28", 8440.00));
        series14.getData().add(new XYChart.Data<>("2016-11-29", 8530.00));
        series14.getData().add(new XYChart.Data<>("2016-11-30", 8370.00));
        series14.getData().add(new XYChart.Data<>("2016-12-01", 8365.00));
        series14.getData().add(new XYChart.Data<>("2016-12-02", 8305.00));
        series14.getData().add(new XYChart.Data<>("2016-12-05", 8350.00));
        series14.getData().add(new XYChart.Data<>("2016-12-06", 8135.00));
        series14.getData().add(new XYChart.Data<>("2016-12-07", 8230.00));
        series14.getData().add(new XYChart.Data<>("2016-12-08", 8180.00));
        series14.getData().add(new XYChart.Data<>("2016-12-09", 8280.00));
        series14.getData().add(new XYChart.Data<>("2016-12-12", 8360.00));
        series14.getData().add(new XYChart.Data<>("2016-12-13", 8475.00));
        series14.getData().add(new XYChart.Data<>("2016-12-14", 8355.00));
        series14.getData().add(new XYChart.Data<>("2016-12-15", 8480.00));
        series14.getData().add(new XYChart.Data<>("2016-12-16", 8615.00));
        series14.getData().add(new XYChart.Data<>("2016-12-19", 8615.00));
        series14.getData().add(new XYChart.Data<>("2016-12-20", 8600.00));
        series14.getData().add(new XYChart.Data<>("2016-12-21", 8515.00));
        series14.getData().add(new XYChart.Data<>("2016-12-22", 8735.00));
        series14.getData().add(new XYChart.Data<>("2016-12-23", 8700.00));
        series14.getData().add(new XYChart.Data<>("2016-12-26", 8700.00));
        series14.getData().add(new XYChart.Data<>("2016-12-27", 8700.00));
        series14.getData().add(new XYChart.Data<>("2016-12-28", 8790.00));
        series14.getData().add(new XYChart.Data<>("2016-12-29", 8720.00));
        series14.getData().add(new XYChart.Data<>("2016-12-30", 8775.00));
        series14.getData().add(new XYChart.Data<>("2017-01-02", 8775.00));
        series14.getData().add(new XYChart.Data<>("2017-01-03", 8775.00));
        series14.getData().add(new XYChart.Data<>("2017-01-04", 8770.00));
        series14.getData().add(new XYChart.Data<>("2017-01-05", 8885.00));
        series14.getData().add(new XYChart.Data<>("2017-01-06", 8815.00));
        series14.getData().add(new XYChart.Data<>("2017-01-09", 8865.00));
        series14.getData().add(new XYChart.Data<>("2017-01-10", 8770.00));
        series14.getData().add(new XYChart.Data<>("2017-01-11", 8700.00));
        series14.getData().add(new XYChart.Data<>("2017-01-12", 8740.00));
        series14.getData().add(new XYChart.Data<>("2017-01-13", 8645.00));
        series14.getData().add(new XYChart.Data<>("2017-01-16", 8640.00));
        series14.getData().add(new XYChart.Data<>("2017-01-17", 8510.00));
        series14.getData().add(new XYChart.Data<>("2017-01-18", 8600.00));
        series14.getData().add(new XYChart.Data<>("2017-01-19", 8590.00));
        series14.getData().add(new XYChart.Data<>("2017-01-20", 8675.00));
        series14.getData().add(new XYChart.Data<>("2017-01-23", 8295.00));
        series14.getData().add(new XYChart.Data<>("2017-01-24", 7940.00));
        series14.getData().add(new XYChart.Data<>("2017-01-25", 7935.00));
        series14.getData().add(new XYChart.Data<>("2017-01-26", 8015.00));
        series14.getData().add(new XYChart.Data<>("2017-01-27", 8105.00));
        series14.getData().add(new XYChart.Data<>("2017-01-30", 8245.00));
        series14.getData().add(new XYChart.Data<>("2017-01-31", 8345.00));
        series14.getData().add(new XYChart.Data<>("2017-02-01", 8330.00));
        series14.getData().add(new XYChart.Data<>("2017-02-02", 8535.00));
        series14.getData().add(new XYChart.Data<>("2017-02-03", 8535.00));
        series14.getData().add(new XYChart.Data<>("2017-02-06", 8560.00));
        series14.getData().add(new XYChart.Data<>("2017-02-07", 8515.00));
        series14.getData().add(new XYChart.Data<>("2017-02-08", 8650.00));
        series14.getData().add(new XYChart.Data<>("2017-02-09", 8680.00));
        series14.getData().add(new XYChart.Data<>("2017-02-10", 8700.00));
        chart14.getData().add(series14);
    
        XYChart.Series<String, Number> series15 = new XYChart.Series<>();
        series15.setName("Series 1"); 
        series15.getData().add(new XYChart.Data<>("2016-11-14", 1510.00));
        series15.getData().add(new XYChart.Data<>("2016-11-15", 1523.00));
        series15.getData().add(new XYChart.Data<>("2016-11-16", 1520.50));
        series15.getData().add(new XYChart.Data<>("2016-11-17", 1520.00));
        series15.getData().add(new XYChart.Data<>("2016-11-18", 1515.00));
        series15.getData().add(new XYChart.Data<>("2016-11-21", 1512.50));
        series15.getData().add(new XYChart.Data<>("2016-11-22", 1542.00));
        series15.getData().add(new XYChart.Data<>("2016-11-23", 1541.00));
        series15.getData().add(new XYChart.Data<>("2016-11-24", 1559.50));
        series15.getData().add(new XYChart.Data<>("2016-11-25", 1550.00));
        series15.getData().add(new XYChart.Data<>("2016-11-28", 1543.00));
        series15.getData().add(new XYChart.Data<>("2016-11-29", 1546.50));
        series15.getData().add(new XYChart.Data<>("2016-11-30", 1548.50));
        series15.getData().add(new XYChart.Data<>("2016-12-01", 1578.00));
        series15.getData().add(new XYChart.Data<>("2016-12-02", 1561.00));
        series15.getData().add(new XYChart.Data<>("2016-12-05", 1584.00));
        series15.getData().add(new XYChart.Data<>("2016-12-06", 1584.50));
        series15.getData().add(new XYChart.Data<>("2016-12-07", 1649.00));
        series15.getData().add(new XYChart.Data<>("2016-12-08", 1627.50));
        series15.getData().add(new XYChart.Data<>("2016-12-09", 1594.00));
        series15.getData().add(new XYChart.Data<>("2016-12-12", 1564.50));
        series15.getData().add(new XYChart.Data<>("2016-12-13", 1575.00));
        series15.getData().add(new XYChart.Data<>("2016-12-14", 1568.50));
        series15.getData().add(new XYChart.Data<>("2016-12-15", 1586.00));
        series15.getData().add(new XYChart.Data<>("2016-12-16", 1583.00));
        series15.getData().add(new XYChart.Data<>("2016-12-19", 1560.00));
        series15.getData().add(new XYChart.Data<>("2016-12-20", 1592.50));
        series15.getData().add(new XYChart.Data<>("2016-12-21", 1593.00));
        series15.getData().add(new XYChart.Data<>("2016-12-22", 1604.00));
        series15.getData().add(new XYChart.Data<>("2016-12-23", 1605.00));
        series15.getData().add(new XYChart.Data<>("2016-12-26", 1605.00));
        series15.getData().add(new XYChart.Data<>("2016-12-27", 1605.00));
        series15.getData().add(new XYChart.Data<>("2016-12-28", 1610.50));
        series15.getData().add(new XYChart.Data<>("2016-12-29", 1615.00));
        series15.getData().add(new XYChart.Data<>("2016-12-30", 1627.50));
        series15.getData().add(new XYChart.Data<>("2017-01-02", 1627.50));
        series15.getData().add(new XYChart.Data<>("2017-01-03", 1638.00));
        series15.getData().add(new XYChart.Data<>("2017-01-04", 1642.00));
        series15.getData().add(new XYChart.Data<>("2017-01-05", 1601.00));
        series15.getData().add(new XYChart.Data<>("2017-01-06", 1612.50));
        series15.getData().add(new XYChart.Data<>("2017-01-09", 1600.00));
        series15.getData().add(new XYChart.Data<>("2017-01-10", 1580.00));
        series15.getData().add(new XYChart.Data<>("2017-01-11", 1590.50));
        series15.getData().add(new XYChart.Data<>("2017-01-12", 1590.00));
        series15.getData().add(new XYChart.Data<>("2017-01-13", 1612.50));
        series15.getData().add(new XYChart.Data<>("2017-01-16", 1578.00));
        series15.getData().add(new XYChart.Data<>("2017-01-17", 1569.50));
        series15.getData().add(new XYChart.Data<>("2017-01-18", 1553.00));
        series15.getData().add(new XYChart.Data<>("2017-01-19", 1552.00));
        series15.getData().add(new XYChart.Data<>("2017-01-20", 1548.50));
        series15.getData().add(new XYChart.Data<>("2017-01-23", 1538.00));
        series15.getData().add(new XYChart.Data<>("2017-01-24", 1555.00));
        series15.getData().add(new XYChart.Data<>("2017-01-25", 1578.50));
        series15.getData().add(new XYChart.Data<>("2017-01-26", 1586.50));
        series15.getData().add(new XYChart.Data<>("2017-01-27", 1577.00));
        series15.getData().add(new XYChart.Data<>("2017-01-30", 1550.00));
        series15.getData().add(new XYChart.Data<>("2017-01-31", 1532.00));
        series15.getData().add(new XYChart.Data<>("2017-02-01", 1557.50));
        series15.getData().add(new XYChart.Data<>("2017-02-02", 1552.50));
        series15.getData().add(new XYChart.Data<>("2017-02-03", 1600.50));
        series15.getData().add(new XYChart.Data<>("2017-02-06", 1583.50));
        series15.getData().add(new XYChart.Data<>("2016-02-07", 1584.00));
        series15.getData().add(new XYChart.Data<>("2017-02-08", 1567.50));
        series15.getData().add(new XYChart.Data<>("2017-02-09", 1600.50));
        series15.getData().add(new XYChart.Data<>("2017-02-10", 1620.50));
        chart15.getData().add(series15);
        
        XYChart.Series<String, Number> series16 = new XYChart.Series<>();
        series16.setName("Series 1"); 
        series16.getData().add(new XYChart.Data<>("2016-11-14", 1739.00));
        series16.getData().add(new XYChart.Data<>("2016-11-15", 1738.00));
        series16.getData().add(new XYChart.Data<>("2016-11-16", 1710.00));
        series16.getData().add(new XYChart.Data<>("2016-11-17", 1763.00));
        series16.getData().add(new XYChart.Data<>("2016-11-18", 1774.00));
        series16.getData().add(new XYChart.Data<>("2016-11-21", 1748.00));
        series16.getData().add(new XYChart.Data<>("2016-11-22", 1778.00));
        series16.getData().add(new XYChart.Data<>("2016-11-23", 1746.00));
        series16.getData().add(new XYChart.Data<>("2016-11-24", 1729.00));
        series16.getData().add(new XYChart.Data<>("2016-11-25", 1705.00));
        series16.getData().add(new XYChart.Data<>("2016-11-28", 1691.00));
        series16.getData().add(new XYChart.Data<>("2016-11-29", 1724.00));
        series16.getData().add(new XYChart.Data<>("2016-11-30", 1700.00));
        series16.getData().add(new XYChart.Data<>("2016-12-01", 1704.00));
        series16.getData().add(new XYChart.Data<>("2016-12-02", 1696.00));
        series16.getData().add(new XYChart.Data<>("2016-12-05", 1704.00));
        series16.getData().add(new XYChart.Data<>("2016-12-06", 1710.00));
        series16.getData().add(new XYChart.Data<>("2016-12-07", 1729.00));
        series16.getData().add(new XYChart.Data<>("2016-12-08", 1737.00));
        series16.getData().add(new XYChart.Data<>("2016-12-09", 1716.00));
        series16.getData().add(new XYChart.Data<>("2016-12-12", 1667.00));
        series16.getData().add(new XYChart.Data<>("2016-12-13", 1699.00));
        series16.getData().add(new XYChart.Data<>("2016-12-14", 1688.00));
        series16.getData().add(new XYChart.Data<>("2016-12-15", 1727.00));
        series16.getData().add(new XYChart.Data<>("2016-12-16", 1706.00));
        series16.getData().add(new XYChart.Data<>("2016-12-19", 1720.00));
        series16.getData().add(new XYChart.Data<>("2016-12-20", 1735.00));
        series16.getData().add(new XYChart.Data<>("2016-12-21", 1747.00));
        series16.getData().add(new XYChart.Data<>("2016-12-22", 1763.00));
        series16.getData().add(new XYChart.Data<>("2016-12-23", 1765.00));
        series16.getData().add(new XYChart.Data<>("2016-12-26", 1765.00));
        series16.getData().add(new XYChart.Data<>("2016-12-27", 1765.00));
        series16.getData().add(new XYChart.Data<>("2016-12-28", 1744.00));
        series16.getData().add(new XYChart.Data<>("2016-12-29", 1746.00));
        series16.getData().add(new XYChart.Data<>("2016-12-30", 1776.00));
        series16.getData().add(new XYChart.Data<>("2017-01-02", 1776.00));
        series16.getData().add(new XYChart.Data<>("2017-01-03", 1760.00));
        series16.getData().add(new XYChart.Data<>("2017-01-04", 1810.00));
        series16.getData().add(new XYChart.Data<>("2017-01-05", 1940.00));
        series16.getData().add(new XYChart.Data<>("2017-01-06", 1934.00));
        series16.getData().add(new XYChart.Data<>("2017-01-09", 1939.00));
        series16.getData().add(new XYChart.Data<>("2017-01-10", 1989.00));
        series16.getData().add(new XYChart.Data<>("2017-01-11", 1981.00));
        series16.getData().add(new XYChart.Data<>("2017-01-12", 1970.00));
        series16.getData().add(new XYChart.Data<>("2017-01-13", 1997.00));
        series16.getData().add(new XYChart.Data<>("2017-01-16", 1968.00));
        series16.getData().add(new XYChart.Data<>("2017-01-17", 1995.00));
        series16.getData().add(new XYChart.Data<>("2017-01-18", 1974.00));
        series16.getData().add(new XYChart.Data<>("2017-01-19", 1955.00));
        series16.getData().add(new XYChart.Data<>("2017-01-20", 1932.00));
        series16.getData().add(new XYChart.Data<>("2017-01-23", 1944.00));
        series16.getData().add(new XYChart.Data<>("2017-01-24", 1921.00));
        series16.getData().add(new XYChart.Data<>("2017-01-25", 1897.00));
        series16.getData().add(new XYChart.Data<>("2017-01-26", 1886.00));
        series16.getData().add(new XYChart.Data<>("2017-01-27", 1917.00));
        series16.getData().add(new XYChart.Data<>("2017-01-30", 1920.00));
        series16.getData().add(new XYChart.Data<>("2017-01-31", 1929.00));
        series16.getData().add(new XYChart.Data<>("2017-02-01", 1951.00));
        series16.getData().add(new XYChart.Data<>("2017-02-02", 1965.00));
        series16.getData().add(new XYChart.Data<>("2017-02-03", 1971.00));
        series16.getData().add(new XYChart.Data<>("2017-02-06", 1938.00));
        series16.getData().add(new XYChart.Data<>("2017-02-07", 1957.00));
        series16.getData().add(new XYChart.Data<>("2017-02-08", 2016.00));
        series16.getData().add(new XYChart.Data<>("2017-02-09", 1988.00));
        series16.getData().add(new XYChart.Data<>("2017-02-10", 1976.00));
        chart16.getData().add(series16);        

        XYChart.Series<String, Number> series17 = new XYChart.Series<>();
        series17.setName("Series 1");
        series17.getData().add(new XYChart.Data<>("2016-11-14", 6703.11));
        series17.getData().add(new XYChart.Data<>("2016-11-15", 6820.501));
        series17.getData().add(new XYChart.Data<>("2016-11-16", 6801.758));
        series17.getData().add(new XYChart.Data<>("2016-11-17", 6799.785));
        series17.getData().add(new XYChart.Data<>("2016-11-18", 6822.474));
        series17.getData().add(new XYChart.Data<>("2016-11-21", 6773.15));
        series17.getData().add(new XYChart.Data<>("2016-11-22", 6727.772));
        series17.getData().add(new XYChart.Data<>("2016-11-23", 6704.097));
        series17.getData().add(new XYChart.Data<>("2016-11-24", 6664.638));
        series17.getData().add(new XYChart.Data<>("2016-11-25", 6724.813));
        series17.getData().add(new XYChart.Data<>("2016-11-28", 6650.827));
        series17.getData().add(new XYChart.Data<>("2016-11-29", 6671.543));
        series17.getData().add(new XYChart.Data<>("2016-11-30", 6671.543));
        series17.getData().add(new XYChart.Data<>("2016-12-01", 6538.368));
        series17.getData().add(new XYChart.Data<>("2016-12-02", 6503.842));
        series17.getData().add(new XYChart.Data<>("2016-12-05", 6464.383));
        series17.getData().add(new XYChart.Data<>("2016-12-06", 6463.396));
        series17.getData().add(new XYChart.Data<>("2016-12-07", 6449.586));
        series17.getData().add(new XYChart.Data<>("2016-12-08", 6443.667));
        series17.getData().add(new XYChart.Data<>("2016-12-09", 6510.747));
        series17.getData().add(new XYChart.Data<>("2016-12-12", 6425.91));
        series17.getData().add(new XYChart.Data<>("2016-12-13", 6606.435));
        series17.getData().add(new XYChart.Data<>("2016-12-14", 6583.746));
        series17.getData().add(new XYChart.Data<>("2016-12-15", 6584.733));
        series17.getData().add(new XYChart.Data<>("2016-12-16", 6524.558));
        series17.getData().add(new XYChart.Data<>("2016-12-19", 6702.124));
        series17.getData().add(new XYChart.Data<>("2016-12-20", 6674.502));
        series17.getData().add(new XYChart.Data<>("2016-12-21", 6652.80));
        series17.getData().add(new XYChart.Data<>("2016-12-22", 6722.84));
        series17.getData().add(new XYChart.Data<>("2016-12-23", 6718.894));
        series17.getData().add(new XYChart.Data<>("2016-12-26", 6718.894));
        series17.getData().add(new XYChart.Data<>("2016-12-27", 6718.894));
        series17.getData().add(new XYChart.Data<>("2016-12-28", 6763.285));
        series17.getData().add(new XYChart.Data<>("2016-12-29", 6767.231));
        series17.getData().add(new XYChart.Data<>("2016-12-30", 6792.88));
        series17.getData().add(new XYChart.Data<>("2017-01-02", 6792.88));
        series17.getData().add(new XYChart.Data<>("2017-01-03", 6692.259));
        series17.getData().add(new XYChart.Data<>("2017-01-04", 6658.719));
        series17.getData().add(new XYChart.Data<>("2017-01-05", 6620.246));
        series17.getData().add(new XYChart.Data<>("2017-01-06", 6596.571));
        series17.getData().add(new XYChart.Data<>("2017-01-09", 6711.002));
        series17.getData().add(new XYChart.Data<>("2017-01-10", 6691.272));
        series17.getData().add(new XYChart.Data<>("2017-01-11", 6663.651));
        series17.getData().add(new XYChart.Data<>("2017-01-12", 6755.393));
        series17.getData().add(new XYChart.Data<>("2017-01-13", 6752.434));
        series17.getData().add(new XYChart.Data<>("2017-01-16", 6860.946));
        series17.getData().add(new XYChart.Data<>("2017-01-17", 6680.421));
        series17.getData().add(new XYChart.Data<>("2017-01-18", 6747.502));
        series17.getData().add(new XYChart.Data<>("2017-01-20", 6732.704));
        series17.getData().add(new XYChart.Data<>("2017-01-23", 6771.177));
        series17.getData().add(new XYChart.Data<>("2017-01-24", 6703.11));
        series17.getData().add(new XYChart.Data<>("2017-01-25", 6719.88));
        series17.getData().add(new XYChart.Data<>("2017-01-26", 6749.475));
        series17.getData().add(new XYChart.Data<>("2017-01-27", 6777.096));
        series17.getData().add(new XYChart.Data<>("2017-01-30", 6728.759));
        series17.getData().add(new XYChart.Data<>("2017-01-31", 6711.988));
        series17.getData().add(new XYChart.Data<>("2017-02-01", 6737.637));
        series17.getData().add(new XYChart.Data<>("2017-02-02", 7012.864));
        series17.getData().add(new XYChart.Data<>("2017-02-03", 7032.593));
        series17.getData().add(new XYChart.Data<>("2017-02-06", 6930.00));
        series17.getData().add(new XYChart.Data<>("2017-02-07", 7012.864));
        series17.getData().add(new XYChart.Data<>("2017-02-08", 7188.457));
        series17.getData().add(new XYChart.Data<>("2017-02-09", 7141.106));
        series17.getData().add(new XYChart.Data<>("2017-02-10", 6930.00));
        chart17.getData().add(series17); 

        XYChart.Series<String, Number> series18 = new XYChart.Series<>();
        series18.setName("Series 1");
        series18.getData().add(new XYChart.Data<>("2016-11-14", 4281.00));
        series18.getData().add(new XYChart.Data<>("2016-11-15", 4300.50));
        series18.getData().add(new XYChart.Data<>("2016-11-16", 4278.00));
        series18.getData().add(new XYChart.Data<>("2016-11-17", 4311.00));
        series18.getData().add(new XYChart.Data<>("2016-11-18", 4359.50));
        series18.getData().add(new XYChart.Data<>("2016-11-21", 4357.50));
        series18.getData().add(new XYChart.Data<>("2016-11-22", 4368.00));
        series18.getData().add(new XYChart.Data<>("2016-11-23", 4368.50));
        series18.getData().add(new XYChart.Data<>("2016-11-24", 4372.00));
        series18.getData().add(new XYChart.Data<>("2016-11-25", 4421.00));
        series18.getData().add(new XYChart.Data<>("2016-11-28", 4448.50));
        series18.getData().add(new XYChart.Data<>("2016-11-29", 4454.50));
        series18.getData().add(new XYChart.Data<>("2016-11-30", 4393.50));
        series18.getData().add(new XYChart.Data<>("2016-12-01", 4309.50));
        series18.getData().add(new XYChart.Data<>("2016-12-02", 4347.00));
        series18.getData().add(new XYChart.Data<>("2016-12-05", 4343.00));
        series18.getData().add(new XYChart.Data<>("2016-12-06", 4320.00));
        series18.getData().add(new XYChart.Data<>("2016-12-07", 4352.50));
        series18.getData().add(new XYChart.Data<>("2016-12-08", 4373.00));
        series18.getData().add(new XYChart.Data<>("2016-12-09", 4420.00));
        series18.getData().add(new XYChart.Data<>("2016-12-12", 4366.00));
        series18.getData().add(new XYChart.Data<>("2016-12-13", 4452.50));
        series18.getData().add(new XYChart.Data<>("2016-12-14", 4468.50));
        series18.getData().add(new XYChart.Data<>("2016-12-15", 4513.00));
        series18.getData().add(new XYChart.Data<>("2016-12-16", 4506.50));
        series18.getData().add(new XYChart.Data<>("2016-12-19", 4551.50));
        series18.getData().add(new XYChart.Data<>("2016-12-20", 4556.00));
        series18.getData().add(new XYChart.Data<>("2016-12-21", 4560.50));
        series18.getData().add(new XYChart.Data<>("2016-12-22", 4546.50));
        series18.getData().add(new XYChart.Data<>("2016-12-23", 4558.00));
        series18.getData().add(new XYChart.Data<>("2016-12-26", 4558.00));
        series18.getData().add(new XYChart.Data<>("2016-12-27", 4558.00));
        series18.getData().add(new XYChart.Data<>("2016-12-28", 4567.00));
        series18.getData().add(new XYChart.Data<>("2016-12-29", 4596.50));
        series18.getData().add(new XYChart.Data<>("2016-12-30", 4621.50));
        series18.getData().add(new XYChart.Data<>("2017-01-02", 4621.50));
        series18.getData().add(new XYChart.Data<>("2017-01-03", 4612.00));
        series18.getData().add(new XYChart.Data<>("2017-01-04", 4591.50));
        series18.getData().add(new XYChart.Data<>("2017-01-05", 4580.00));
        series18.getData().add(new XYChart.Data<>("2017-01-06", 4574.00));
        series18.getData().add(new XYChart.Data<>("2017-01-09", 4675.00));
        series18.getData().add(new XYChart.Data<>("2017-01-10", 4672.00));
        series18.getData().add(new XYChart.Data<>("2017-01-11", 4713.00));
        series18.getData().add(new XYChart.Data<>("2017-01-12", 4705.00));
        series18.getData().add(new XYChart.Data<>("2017-01-13", 4729.50));
        series18.getData().add(new XYChart.Data<>("2017-01-16", 4762.50));
        series18.getData().add(new XYChart.Data<>("2017-01-17", 4580.00));
        series18.getData().add(new XYChart.Data<>("2017-01-18", 4634.00));
        series18.getData().add(new XYChart.Data<>("2017-01-19", 4734.00));
        series18.getData().add(new XYChart.Data<>("2017-01-20", 4760.00));
        series18.getData().add(new XYChart.Data<>("2017-01-23", 4767.00));
        series18.getData().add(new XYChart.Data<>("2017-01-24", 4800.00));
        series18.getData().add(new XYChart.Data<>("2017-01-25", 4894.00));
        series18.getData().add(new XYChart.Data<>("2017-01-26", 4929.50));
        series18.getData().add(new XYChart.Data<>("2017-01-27", 4920.50));
        series18.getData().add(new XYChart.Data<>("2017-01-30", 4896.50));
        series18.getData().add(new XYChart.Data<>("2017-01-31", 4899.50));
        series18.getData().add(new XYChart.Data<>("2017-02-01", 4865.50));
        series18.getData().add(new XYChart.Data<>("2017-02-02", 4910.00));
        series18.getData().add(new XYChart.Data<>("2017-02-03", 4963.00));
        series18.getData().add(new XYChart.Data<>("2017-02-06", 4985.00));
        series18.getData().add(new XYChart.Data<>("2017-02-07", 4981.50));
        series18.getData().add(new XYChart.Data<>("2017-02-08", 5025.00));
        series18.getData().add(new XYChart.Data<>("2017-02-09", 5021.00));
        series18.getData().add(new XYChart.Data<>("2017-02-10", 5008.00));
        chart18.getData().add(series18);

        XYChart.Series<String, Number> series19 = new XYChart.Series<>();
        series19.setName("Series 1");
        series19.getData().add(new XYChart.Data<>("2016-11-14", 746.00));
        series19.getData().add(new XYChart.Data<>("2016-11-15", 754.50));
        series19.getData().add(new XYChart.Data<>("2016-11-16", 738.50));
        series19.getData().add(new XYChart.Data<>("2016-11-17", 699.00));
        series19.getData().add(new XYChart.Data<>("2016-11-18", 657.50));
        series19.getData().add(new XYChart.Data<>("2016-11-21", 657.00));
        series19.getData().add(new XYChart.Data<>("2016-11-22", 660.00));
        series19.getData().add(new XYChart.Data<>("2016-11-23", 670.50));
        series19.getData().add(new XYChart.Data<>("2016-11-24", 672.50));
        series19.getData().add(new XYChart.Data<>("2016-11-25", 666.00));
        series19.getData().add(new XYChart.Data<>("2016-11-28", 672.50));
        series19.getData().add(new XYChart.Data<>("2016-11-29", 673.00));
        series19.getData().add(new XYChart.Data<>("2016-11-30", 676.50));
        series19.getData().add(new XYChart.Data<>("2016-12-01", 682.00));
        series19.getData().add(new XYChart.Data<>("2016-12-02", 661.00));
        series19.getData().add(new XYChart.Data<>("2016-12-05", 665.50));
        series19.getData().add(new XYChart.Data<>("2016-12-06", 661.50));
        series19.getData().add(new XYChart.Data<>("2016-12-07", 672.50));
        series19.getData().add(new XYChart.Data<>("2016-12-08", 658.50));
        series19.getData().add(new XYChart.Data<>("2016-12-09", 668.00));
        series19.getData().add(new XYChart.Data<>("2016-12-12", 651.00));
        series19.getData().add(new XYChart.Data<>("2016-12-13", 678.00));
        series19.getData().add(new XYChart.Data<>("2016-12-14", 670.00));
        series19.getData().add(new XYChart.Data<>("2016-12-15", 671.50));
        series19.getData().add(new XYChart.Data<>("2016-12-16", 675.00));
        series19.getData().add(new XYChart.Data<>("2016-12-19", 673.00));
        series19.getData().add(new XYChart.Data<>("2016-12-20", 676.00));
        series19.getData().add(new XYChart.Data<>("2016-12-21", 685.00));
        series19.getData().add(new XYChart.Data<>("2016-12-22", 682.50));
        series19.getData().add(new XYChart.Data<>("2016-12-23", 680.50));
        series19.getData().add(new XYChart.Data<>("2016-12-26", 680.50));
        series19.getData().add(new XYChart.Data<>("2016-12-27", 680.50));
        series19.getData().add(new XYChart.Data<>("2016-12-28", 686.50));
        series19.getData().add(new XYChart.Data<>("2016-12-29", 678.00));
        series19.getData().add(new XYChart.Data<>("2016-12-30", 668.00));
        series19.getData().add(new XYChart.Data<>("2017-01-02", 668.00));
        series19.getData().add(new XYChart.Data<>("2017-01-03", 670.00));
        series19.getData().add(new XYChart.Data<>("2017-01-04", 667.50));
        series19.getData().add(new XYChart.Data<>("2017-01-05", 639.50));
        series19.getData().add(new XYChart.Data<>("2017-01-06", 650.50));
        series19.getData().add(new XYChart.Data<>("2017-01-09", 661.00));
        series19.getData().add(new XYChart.Data<>("2017-01-10", 667.50));
        series19.getData().add(new XYChart.Data<>("2017-01-11", 670.00));
        series19.getData().add(new XYChart.Data<>("2017-01-12", 677.00));
        series19.getData().add(new XYChart.Data<>("2017-01-13", 661.50));
        series19.getData().add(new XYChart.Data<>("2017-01-16", 665.00));
        series19.getData().add(new XYChart.Data<>("2017-01-17", 694.50));
        series19.getData().add(new XYChart.Data<>("2017-01-18", 693.50));
        series19.getData().add(new XYChart.Data<>("2017-01-19", 702.50));
        series19.getData().add(new XYChart.Data<>("2017-01-20", 688.50));
        series19.getData().add(new XYChart.Data<>("2017-01-23", 691.50));
        series19.getData().add(new XYChart.Data<>("2017-01-24", 680.50));
        series19.getData().add(new XYChart.Data<>("2017-01-25", 686.00));
        series19.getData().add(new XYChart.Data<>("2017-01-26", 692.00));
        series19.getData().add(new XYChart.Data<>("2017-01-27", 686.00));
        series19.getData().add(new XYChart.Data<>("2017-01-30", 660.00));
        series19.getData().add(new XYChart.Data<>("2017-01-31", 667.50));
        series19.getData().add(new XYChart.Data<>("2017-02-01", 668.00));
        series19.getData().add(new XYChart.Data<>("2017-02-02", 674.00));
        series19.getData().add(new XYChart.Data<>("2017-02-03", 671.00));
        series19.getData().add(new XYChart.Data<>("2017-02-06", 680.50));
        series19.getData().add(new XYChart.Data<>("2017-02-07", 700.50));
        series19.getData().add(new XYChart.Data<>("2017-02-08", 720.00));
        series19.getData().add(new XYChart.Data<>("2017-02-09", 718.00));
        series19.getData().add(new XYChart.Data<>("2017-02-10", 732.50));
        chart19.getData().add(series19);
        
        XYChart.Series<String, Number> series20 = new XYChart.Series<>();
        series20.setName("Series 1");
        series20.getData().add(new XYChart.Data<>("2016-11-14", 2884.00));
        series20.getData().add(new XYChart.Data<>("2016-11-15", 2906.00));
        series20.getData().add(new XYChart.Data<>("2016-11-16", 2868.00));
        series20.getData().add(new XYChart.Data<>("2016-11-17", 2869.00));
        series20.getData().add(new XYChart.Data<>("2016-11-18", 2872.00));
        series20.getData().add(new XYChart.Data<>("2016-11-21", 2818.00));
        series20.getData().add(new XYChart.Data<>("2016-11-22", 2864.00));
        series20.getData().add(new XYChart.Data<>("2016-11-23", 2850.00));
        series20.getData().add(new XYChart.Data<>("2016-11-24", 2845.00));
        series20.getData().add(new XYChart.Data<>("2016-11-25", 2869.00));
        series20.getData().add(new XYChart.Data<>("2016-11-28", 2819.00));
        series20.getData().add(new XYChart.Data<>("2016-11-29", 2788.00));
        series20.getData().add(new XYChart.Data<>("2016-11-30", 2765.00));
        series20.getData().add(new XYChart.Data<>("2016-12-01", 2785.00));
        series20.getData().add(new XYChart.Data<>("2016-12-02", 2789.00));
        series20.getData().add(new XYChart.Data<>("2016-12-05", 2791.00));
        series20.getData().add(new XYChart.Data<>("2016-12-06", 2800.00));
        series20.getData().add(new XYChart.Data<>("2016-12-07", 2888.00));
        series20.getData().add(new XYChart.Data<>("2016-12-08", 2923.00));
        series20.getData().add(new XYChart.Data<>("2016-12-09", 2936.00));
        series20.getData().add(new XYChart.Data<>("2016-12-12", 2890.00));
        series20.getData().add(new XYChart.Data<>("2016-12-13", 2938.00));
        series20.getData().add(new XYChart.Data<>("2016-12-14", 2936.00));
        series20.getData().add(new XYChart.Data<>("2016-12-15", 2977.00));
        series20.getData().add(new XYChart.Data<>("2016-12-16", 2985.00));
        series20.getData().add(new XYChart.Data<>("2016-12-19", 2965.00));
        series20.getData().add(new XYChart.Data<>("2016-12-20", 2992.00));
        series20.getData().add(new XYChart.Data<>("2016-12-21", 2966.00));
        series20.getData().add(new XYChart.Data<>("2016-12-22", 2968.00));
        series20.getData().add(new XYChart.Data<>("2016-12-23", 2985.00));
        series20.getData().add(new XYChart.Data<>("2016-12-26", 2985.00));
        series20.getData().add(new XYChart.Data<>("2016-12-27", 2985.00));
        series20.getData().add(new XYChart.Data<>("2016-12-28", 2983.00));
        series20.getData().add(new XYChart.Data<>("2016-12-29", 2981.00));
        series20.getData().add(new XYChart.Data<>("2016-12-30", 2998.00));
        series20.getData().add(new XYChart.Data<>("2017-01-02", 2998.00));
        series20.getData().add(new XYChart.Data<>("2017-01-03", 3041.00));
        series20.getData().add(new XYChart.Data<>("2017-01-04", 3020.00));
        series20.getData().add(new XYChart.Data<>("2017-01-05", 3021.00));
        series20.getData().add(new XYChart.Data<>("2017-01-06", 3019.00));
        series20.getData().add(new XYChart.Data<>("2017-01-09", 3032.00));
        series20.getData().add(new XYChart.Data<>("2017-01-10", 3037.00));
        series20.getData().add(new XYChart.Data<>("2017-01-11", 3035.00));
        series20.getData().add(new XYChart.Data<>("2017-01-12", 3008.00));
        series20.getData().add(new XYChart.Data<>("2017-01-13", 3047.00));
        series20.getData().add(new XYChart.Data<>("2017-01-16", 3035.00));
        series20.getData().add(new XYChart.Data<>("2017-01-17", 3033.00));
        series20.getData().add(new XYChart.Data<>("2017-01-18", 3020.00));
        series20.getData().add(new XYChart.Data<>("2017-01-19", 2982.00));
        series20.getData().add(new XYChart.Data<>("2017-01-20", 2987.00));
        series20.getData().add(new XYChart.Data<>("2017-01-23", 2981.00));
        series20.getData().add(new XYChart.Data<>("2017-01-24", 2989.00));
        series20.getData().add(new XYChart.Data<>("2017-01-25", 3006.00));
        series20.getData().add(new XYChart.Data<>("2017-01-26", 2947.00));
        series20.getData().add(new XYChart.Data<>("2017-01-27", 2923.00));
        series20.getData().add(new XYChart.Data<>("2017-01-30", 2901.00));
        series20.getData().add(new XYChart.Data<>("2017-01-31", 2934.00));
        series20.getData().add(new XYChart.Data<>("2017-02-01", 2942.00));
        series20.getData().add(new XYChart.Data<>("2017-02-02", 2920.00));
        series20.getData().add(new XYChart.Data<>("2017-02-03", 2958.00));
        series20.getData().add(new XYChart.Data<>("2017-02-06", 2937.00));
        series20.getData().add(new XYChart.Data<>("2017-02-07", 2986.00));
        series20.getData().add(new XYChart.Data<>("2017-02-08", 2992.00));
        series20.getData().add(new XYChart.Data<>("2017-02-09", 3028.00));
        series20.getData().add(new XYChart.Data<>("2017-02-10", 3041.00));
        chart20.getData().add(series20);  
    
        XYChart.Series<String, Number> series21 = new XYChart.Series<>();
        series21.setName("Series 1");
        series21.getData().add(new XYChart.Data<>("2016-11-14", 4942.00));
        series21.getData().add(new XYChart.Data<>("2016-11-15", 4852.50));
        series21.getData().add(new XYChart.Data<>("2016-11-16", 4845.00));
        series21.getData().add(new XYChart.Data<>("2016-11-17", 4826.50));
        series21.getData().add(new XYChart.Data<>("2016-11-18", 4799.00));
        series21.getData().add(new XYChart.Data<>("2016-11-21", 4712.00));
        series21.getData().add(new XYChart.Data<>("2016-11-22", 4601.50));
        series21.getData().add(new XYChart.Data<>("2016-11-23", 4596.00));
        series21.getData().add(new XYChart.Data<>("2016-11-24", 4650.50));
        series21.getData().add(new XYChart.Data<>("2016-11-25", 4689.00));
        series21.getData().add(new XYChart.Data<>("2016-11-28", 4720.00));
        series21.getData().add(new XYChart.Data<>("2016-11-29", 4721.00));
        series21.getData().add(new XYChart.Data<>("2016-11-30", 4660.00));
        series21.getData().add(new XYChart.Data<>("2016-12-01", 4554.50));
        series21.getData().add(new XYChart.Data<>("2016-12-02", 4589.50));
        series21.getData().add(new XYChart.Data<>("2016-12-05", 4620.00));
        series21.getData().add(new XYChart.Data<>("2016-12-06", 4561.00));
        series21.getData().add(new XYChart.Data<>("2016-12-07", 4357.00));
        series21.getData().add(new XYChart.Data<>("2016-12-08", 4330.50));
        series21.getData().add(new XYChart.Data<>("2016-12-09", 4432.50));
        series21.getData().add(new XYChart.Data<>("2016-12-12", 4315.00));
        series21.getData().add(new XYChart.Data<>("2016-12-13", 4433.00));
        series21.getData().add(new XYChart.Data<>("2016-12-14", 4435.00));
        series21.getData().add(new XYChart.Data<>("2016-12-15", 4503.00));
        series21.getData().add(new XYChart.Data<>("2016-12-16", 4597.00));
        series21.getData().add(new XYChart.Data<>("2016-12-19", 4602.00));
        series21.getData().add(new XYChart.Data<>("2016-12-20", 4570.00));
        series21.getData().add(new XYChart.Data<>("2016-12-21", 4558.00));
        series21.getData().add(new XYChart.Data<>("2016-12-22", 4562.50));
        series21.getData().add(new XYChart.Data<>("2016-12-23", 4548.00));
        series21.getData().add(new XYChart.Data<>("2016-12-26", 4548.00));
        series21.getData().add(new XYChart.Data<>("2016-12-27", 4548.00));
        series21.getData().add(new XYChart.Data<>("2016-12-28", 4628.00));
        series21.getData().add(new XYChart.Data<>("2016-12-29", 4633.50));
        series21.getData().add(new XYChart.Data<>("2016-12-30", 4684.00));
        series21.getData().add(new XYChart.Data<>("2017-01-02", 4684.00));
        series21.getData().add(new XYChart.Data<>("2017-01-03", 4760.00));
        series21.getData().add(new XYChart.Data<>("2017-01-04", 4831.00));
        series21.getData().add(new XYChart.Data<>("2017-01-05", 4899.00));
        series21.getData().add(new XYChart.Data<>("2017-01-06", 4856.50));
        series21.getData().add(new XYChart.Data<>("2017-01-09", 4887.50));
        series21.getData().add(new XYChart.Data<>("2017-01-10", 4834.50));
        series21.getData().add(new XYChart.Data<>("2017-01-11", 4681.50));
        series21.getData().add(new XYChart.Data<>("2017-01-12", 4555.00));
        series21.getData().add(new XYChart.Data<>("2017-01-13", 4661.50));
        series21.getData().add(new XYChart.Data<>("2017-01-16", 4619.00));
        series21.getData().add(new XYChart.Data<>("2017-01-17", 4515.00));
        series21.getData().add(new XYChart.Data<>("2017-01-18", 4503.50));
        series21.getData().add(new XYChart.Data<>("2017-01-19", 4483.50));
        series21.getData().add(new XYChart.Data<>("2017-01-20", 4393.00));
        series21.getData().add(new XYChart.Data<>("2017-01-23", 4320.00));
        series21.getData().add(new XYChart.Data<>("2017-01-24", 4366.00));
        series21.getData().add(new XYChart.Data<>("2017-01-25", 4405.00));
        series21.getData().add(new XYChart.Data<>("2017-01-26", 4438.00));
        series21.getData().add(new XYChart.Data<>("2017-01-27", 4389.00));
        series21.getData().add(new XYChart.Data<>("2017-01-30", 4363.50));
        series21.getData().add(new XYChart.Data<>("2017-01-31", 4379.50));
        series21.getData().add(new XYChart.Data<>("2017-02-01", 4466.50));
        series21.getData().add(new XYChart.Data<>("2017-02-02", 4452.50));
        series21.getData().add(new XYChart.Data<>("2017-02-03", 4461.50));
        series21.getData().add(new XYChart.Data<>("2017-02-06", 4448.50));
        series21.getData().add(new XYChart.Data<>("2017-02-07", 4561.00));
        series21.getData().add(new XYChart.Data<>("2017-02-08", 4534.50));
        series21.getData().add(new XYChart.Data<>("2017-02-09", 4527.00));
        series21.getData().add(new XYChart.Data<>("2017-02-10", 4595.00));
        chart21.getData().add(series21); 

        XYChart.Series<String, Number> series22 = new XYChart.Series<>();
        series22.setName("Series 1");
        series22.getData().add(new XYChart.Data<>("2016-11-14", 770.00));
        series22.getData().add(new XYChart.Data<>("2016-11-15", 789.00));
        series22.getData().add(new XYChart.Data<>("2016-11-16", 790.00));
        series22.getData().add(new XYChart.Data<>("2016-11-17", 784.50));
        series22.getData().add(new XYChart.Data<>("2016-11-18", 767.00));
        series22.getData().add(new XYChart.Data<>("2016-11-21", 750.50));
        series22.getData().add(new XYChart.Data<>("2016-11-22", 763.50));
        series22.getData().add(new XYChart.Data<>("2016-11-23", 755.00));
        series22.getData().add(new XYChart.Data<>("2016-11-24", 757.50));
        series22.getData().add(new XYChart.Data<>("2016-11-25", 787.00));
        series22.getData().add(new XYChart.Data<>("2016-11-28", 769.00));
        series22.getData().add(new XYChart.Data<>("2016-11-29", 774.50));
        series22.getData().add(new XYChart.Data<>("2016-11-30", 781.00));
        series22.getData().add(new XYChart.Data<>("2016-12-01", 773.50));
        series22.getData().add(new XYChart.Data<>("2016-12-02", 767.50));
        series22.getData().add(new XYChart.Data<>("2016-12-05", 754.50));
        series22.getData().add(new XYChart.Data<>("2016-12-06", 769.00));
        series22.getData().add(new XYChart.Data<>("2016-12-07", 773.00));
        series22.getData().add(new XYChart.Data<>("2016-12-08", 789.50));
        series22.getData().add(new XYChart.Data<>("2016-12-09", 1000.00));
        series22.getData().add(new XYChart.Data<>("2016-12-12", 972.00));
        series22.getData().add(new XYChart.Data<>("2016-12-13", 988.00));
        series22.getData().add(new XYChart.Data<>("2016-12-14", 983.50));
        series22.getData().add(new XYChart.Data<>("2016-12-15", 988.00));
        series22.getData().add(new XYChart.Data<>("2016-12-16", 991.00));
        series22.getData().add(new XYChart.Data<>("2016-12-19", 995.00));
        series22.getData().add(new XYChart.Data<>("2016-12-20", 985.00));
        series22.getData().add(new XYChart.Data<>("2016-12-21", 986.50));
        series22.getData().add(new XYChart.Data<>("2016-12-22", 988.50));
        series22.getData().add(new XYChart.Data<>("2016-12-23", 982.50));
        series22.getData().add(new XYChart.Data<>("2016-12-26", 982.50));
        series22.getData().add(new XYChart.Data<>("2016-12-27", 982.50));
        series22.getData().add(new XYChart.Data<>("2016-12-28", 985.00));
        series22.getData().add(new XYChart.Data<>("2016-12-29", 989.00));
        series22.getData().add(new XYChart.Data<>("2016-12-30", 991.00));
        series22.getData().add(new XYChart.Data<>("2017-01-02", 991.00));
        series22.getData().add(new XYChart.Data<>("2017-01-03", 989.00));
        series22.getData().add(new XYChart.Data<>("2017-01-04", 987.50));
        series22.getData().add(new XYChart.Data<>("2017-01-05", 990.00));
        series22.getData().add(new XYChart.Data<>("2017-01-06", 991.00));
        series22.getData().add(new XYChart.Data<>("2017-01-09", 988.00));
        series22.getData().add(new XYChart.Data<>("2017-01-10", 988.00));
        series22.getData().add(new XYChart.Data<>("2017-01-11", 988.50));
        series22.getData().add(new XYChart.Data<>("2017-01-12", 990.50));
        series22.getData().add(new XYChart.Data<>("2017-01-13", 992.00));
        series22.getData().add(new XYChart.Data<>("2017-01-16", 994.00));
        series22.getData().add(new XYChart.Data<>("2017-01-17", 994.50));
        series22.getData().add(new XYChart.Data<>("2017-01-18", 997.00));
        series22.getData().add(new XYChart.Data<>("2017-01-19", 999.00));
        series22.getData().add(new XYChart.Data<>("2017-01-20", 999.00));
        series22.getData().add(new XYChart.Data<>("2017-01-23", 1001.00));
        series22.getData().add(new XYChart.Data<>("2017-01-24", 1001.00));
        series22.getData().add(new XYChart.Data<>("2017-01-25", 1003.00));
        series22.getData().add(new XYChart.Data<>("2017-01-26", 1004.00));
        series22.getData().add(new XYChart.Data<>("2017-01-27", 1005.00));
        series22.getData().add(new XYChart.Data<>("2017-01-30", 1002.00));
        series22.getData().add(new XYChart.Data<>("2017-01-31", 1001.00));
        series22.getData().add(new XYChart.Data<>("2017-02-01", 1004.00));
        series22.getData().add(new XYChart.Data<>("2017-02-02", 1005.00));
        series22.getData().add(new XYChart.Data<>("2017-02-03", 1005.00));
        series22.getData().add(new XYChart.Data<>("2017-02-06", 1006.00));
        series22.getData().add(new XYChart.Data<>("2017-02-07", 1006.00));
        series22.getData().add(new XYChart.Data<>("2017-02-08", 1001.00));
        series22.getData().add(new XYChart.Data<>("2017-02-09", 1000.00));
        series22.getData().add(new XYChart.Data<>("2017-02-10", 1000.00));
        chart22.getData().add(series22); 

        XYChart.Series<String, Number> series23 = new XYChart.Series<>();
        series23.setName("Series 1");
        series23.getData().add(new XYChart.Data<>("2016-11-14", 1410.729));
        series23.getData().add(new XYChart.Data<>("2016-11-15", 1428.413));
        series23.getData().add(new XYChart.Data<>("2016-11-16", 1428.413));
        series23.getData().add(new XYChart.Data<>("2016-11-17", 1426.448));
        series23.getData().add(new XYChart.Data<>("2016-11-18", 1416.624));
        series23.getData().add(new XYChart.Data<>("2016-11-21", 1411.712));
        series23.getData().add(new XYChart.Data<>("2016-11-22", 1436.272));
        series23.getData().add(new XYChart.Data<>("2016-11-23", 1435.289));
        series23.getData().add(new XYChart.Data<>("2016-11-24", 1425.465));
        series23.getData().add(new XYChart.Data<>("2016-11-25", 1438.237));
        series23.getData().add(new XYChart.Data<>("2016-11-28", 1468.691));
        series23.getData().add(new XYChart.Data<>("2016-11-29", 1465.744));
        series23.getData().add(new XYChart.Data<>("2016-11-30", 1449.043));
        series23.getData().add(new XYChart.Data<>("2016-12-01", 1428.413));
        series23.getData().add(new XYChart.Data<>("2016-12-02", 1451.99));
        series23.getData().add(new XYChart.Data<>("2016-12-05", 1444.131));
        series23.getData().add(new XYChart.Data<>("2016-12-06", 1466.726));
        series23.getData().add(new XYChart.Data<>("2016-12-07", 1471.638));
        series23.getData().add(new XYChart.Data<>("2016-12-08", 1456.902));
        series23.getData().add(new XYChart.Data<>("2016-12-09", 1465.744));
        series23.getData().add(new XYChart.Data<>("2016-12-12", 1473.603));
        series23.getData().add(new XYChart.Data<>("2016-12-13", 1498.163));
        series23.getData().add(new XYChart.Data<>("2016-12-14", 1481.462));
        series23.getData().add(new XYChart.Data<>("2016-12-15", 1495.216));
        series23.getData().add(new XYChart.Data<>("2016-12-16", 1490.304));
        series23.getData().add(new XYChart.Data<>("2016-12-19", 1494.233));
        series23.getData().add(new XYChart.Data<>("2016-12-20", 1504.058));
        series23.getData().add(new XYChart.Data<>("2016-12-21", 1504.058));
        series23.getData().add(new XYChart.Data<>("2016-12-22", 1508.97));
        series23.getData().add(new XYChart.Data<>("2016-12-23", 1526.653));
        series23.getData().add(new XYChart.Data<>("2016-12-26", 1526.653));
        series23.getData().add(new XYChart.Data<>("2016-12-27", 1526.653));
        series23.getData().add(new XYChart.Data<>("2016-12-28", 1520.758));
        series23.getData().add(new XYChart.Data<>("2016-12-29", 1535.494));
        series23.getData().add(new XYChart.Data<>("2016-12-30", 1525.67));
        series23.getData().add(new XYChart.Data<>("2017-01-02", 1525.67));
        series23.getData().add(new XYChart.Data<>("2017-01-03", 1527.635));
        series23.getData().add(new XYChart.Data<>("2017-01-04", 1508.97));
        series23.getData().add(new XYChart.Data<>("2017-01-05", 1517.811));
        series23.getData().add(new XYChart.Data<>("2017-01-06", 1512.899));
        series23.getData().add(new XYChart.Data<>("2017-01-09", 1510.934));
        series23.getData().add(new XYChart.Data<>("2017-01-10", 1500.128));
        series23.getData().add(new XYChart.Data<>("2017-01-11", 1501.11));
        series23.getData().add(new XYChart.Data<>("2017-01-12", 1519.776));
        series23.getData().add(new XYChart.Data<>("2017-01-13", 1525.67));
        series23.getData().add(new XYChart.Data<>("2017-01-16", 1528.618));
        series23.getData().add(new XYChart.Data<>("2017-01-17", 1523.706));
        series23.getData().add(new XYChart.Data<>("2017-01-18", 1529.60));
        series23.getData().add(new XYChart.Data<>("2017-01-19", 1515.00));
        series23.getData().add(new XYChart.Data<>("2017-01-20", 1506.00));
        series23.getData().add(new XYChart.Data<>("2017-01-23", 1502.00));
        series23.getData().add(new XYChart.Data<>("2017-01-24", 1508.00));
        series23.getData().add(new XYChart.Data<>("2017-01-25", 1502.00));
        series23.getData().add(new XYChart.Data<>("2017-01-26", 1495.00));
        series23.getData().add(new XYChart.Data<>("2017-01-27", 1492.00));
        series23.getData().add(new XYChart.Data<>("2017-01-30", 1492.00));
        series23.getData().add(new XYChart.Data<>("2017-01-31", 1489.00));
        series23.getData().add(new XYChart.Data<>("2017-02-01", 1475.00));
        series23.getData().add(new XYChart.Data<>("2017-02-02", 1482.00));
        series23.getData().add(new XYChart.Data<>("2017-02-03", 1480.00));
        series23.getData().add(new XYChart.Data<>("2017-02-06", 1488.00));
        series23.getData().add(new XYChart.Data<>("2017-02-07", 1513.00));
        series23.getData().add(new XYChart.Data<>("2017-02-08", 1540.00));
        series23.getData().add(new XYChart.Data<>("2017-02-09", 1544.00));
        series23.getData().add(new XYChart.Data<>("2017-02-10", 1537.00));
        chart23.getData().add(series23);     
    
        XYChart.Series<String, Number> series24 = new XYChart.Series<>();
        series24.setName("Series 1");
        series24.getData().add(new XYChart.Data<>("2016-11-14", 940.50));
        series24.getData().add(new XYChart.Data<>("2016-11-15", 953.50));
        series24.getData().add(new XYChart.Data<>("2016-11-16", 944.50));
        series24.getData().add(new XYChart.Data<>("2016-11-17", 946.50));
        series24.getData().add(new XYChart.Data<>("2016-11-18", 952.00));
        series24.getData().add(new XYChart.Data<>("2016-11-21", 932.50));
        series24.getData().add(new XYChart.Data<>("2016-11-22", 944.00));
        series24.getData().add(new XYChart.Data<>("2016-11-23", 940.00));
        series24.getData().add(new XYChart.Data<>("2016-11-24", 942.50));
        series24.getData().add(new XYChart.Data<>("2016-11-25", 937.00));
        series24.getData().add(new XYChart.Data<>("2016-11-28", 939.00));
        series24.getData().add(new XYChart.Data<>("2016-11-29", 947.00));
        series24.getData().add(new XYChart.Data<>("2016-11-30", 940.00));
        series24.getData().add(new XYChart.Data<>("2016-12-01", 942.50));
        series24.getData().add(new XYChart.Data<>("2016-12-02", 939.50));
        series24.getData().add(new XYChart.Data<>("2016-12-05", 940.00));
        series24.getData().add(new XYChart.Data<>("2016-12-06", 943.50));
        series24.getData().add(new XYChart.Data<>("2016-12-07", 985.00));
        series24.getData().add(new XYChart.Data<>("2016-12-08", 987.50));
        series24.getData().add(new XYChart.Data<>("2016-12-09", 999.50));
        series24.getData().add(new XYChart.Data<>("2016-12-12", 979.50));
        series24.getData().add(new XYChart.Data<>("2016-12-13", 989.00));
        series24.getData().add(new XYChart.Data<>("2016-12-14", 1010.00));
        series24.getData().add(new XYChart.Data<>("2016-12-15", 1000.00));
        series24.getData().add(new XYChart.Data<>("2016-12-16", 999.00));
        series24.getData().add(new XYChart.Data<>("2016-12-19", 990.50));
        series24.getData().add(new XYChart.Data<>("2016-12-20", 992.00));
        series24.getData().add(new XYChart.Data<>("2016-12-21", 987.50));
        series24.getData().add(new XYChart.Data<>("2016-12-22", 993.50));
        series24.getData().add(new XYChart.Data<>("2016-12-23", 998.50));
        series24.getData().add(new XYChart.Data<>("2016-12-26", 998.50));
        series24.getData().add(new XYChart.Data<>("2016-12-27", 998.50));
        series24.getData().add(new XYChart.Data<>("2016-12-28", 1001.00));
        series24.getData().add(new XYChart.Data<>("2016-12-29", 1004.00));
        series24.getData().add(new XYChart.Data<>("2016-12-30", 1014.00));
        series24.getData().add(new XYChart.Data<>("2017-01-02", 1014.00));
        series24.getData().add(new XYChart.Data<>("2017-01-03", 1036.00));
        series24.getData().add(new XYChart.Data<>("2017-01-04", 1047.00));
        series24.getData().add(new XYChart.Data<>("2017-01-05", 1050.00));
        series24.getData().add(new XYChart.Data<>("2017-01-06", 1060.00));
        series24.getData().add(new XYChart.Data<>("2017-01-09", 1057.00));
        series24.getData().add(new XYChart.Data<>("2017-01-10", 1064.00));
        series24.getData().add(new XYChart.Data<>("2017-01-11", 1073.00));
        series24.getData().add(new XYChart.Data<>("2017-01-12", 1059.00));
        series24.getData().add(new XYChart.Data<>("2017-01-13", 1085.00));
        series24.getData().add(new XYChart.Data<>("2017-01-16", 1067.00));
        series24.getData().add(new XYChart.Data<>("2017-01-17", 1058.00));
        series24.getData().add(new XYChart.Data<>("2017-01-18", 1052.00));
        series24.getData().add(new XYChart.Data<>("2017-01-19", 1053.00));
        series24.getData().add(new XYChart.Data<>("2017-01-20", 1060.00));
        series24.getData().add(new XYChart.Data<>("2017-01-23", 1058.00));
        series24.getData().add(new XYChart.Data<>("2017-01-24", 1060.00));
        series24.getData().add(new XYChart.Data<>("2017-01-25", 1093.00));
        series24.getData().add(new XYChart.Data<>("2017-01-26", 1073.00));
        series24.getData().add(new XYChart.Data<>("2017-01-27", 1083.00));
        series24.getData().add(new XYChart.Data<>("2017-01-30", 1069.00));
        series24.getData().add(new XYChart.Data<>("2017-01-31", 1071.00));
        series24.getData().add(new XYChart.Data<>("2017-02-01", 1078.00));
        series24.getData().add(new XYChart.Data<>("2017-02-02", 1071.00));
        series24.getData().add(new XYChart.Data<>("2017-02-03", 1080.00));
        series24.getData().add(new XYChart.Data<>("2017-02-06", 1064.00));
        series24.getData().add(new XYChart.Data<>("2017-02-07", 1068.00));
        series24.getData().add(new XYChart.Data<>("2017-02-08", 1065.00));
        series24.getData().add(new XYChart.Data<>("2017-02-09", 1082.00));
        series24.getData().add(new XYChart.Data<>("2017-02-10", 1083.00));
        chart24.getData().add(series24);
        
        XYChart.Series<String, Number> series25 = new XYChart.Series<>();
        series25.setName("Series 1");
        series25.getData().add(new XYChart.Data<>("2016-11-14", 205.85));
        series25.getData().add(new XYChart.Data<>("2016-11-15", 217.00));
        series25.getData().add(new XYChart.Data<>("2016-11-16", 213.15));
        series25.getData().add(new XYChart.Data<>("2016-11-17", 214.00));
        series25.getData().add(new XYChart.Data<>("2016-11-18", 212.50));
        series25.getData().add(new XYChart.Data<>("2016-11-21", 213.30));
        series25.getData().add(new XYChart.Data<>("2016-11-22", 218.70));
        series25.getData().add(new XYChart.Data<>("2016-11-23", 213.40));
        series25.getData().add(new XYChart.Data<>("2016-11-24", 211.50));
        series25.getData().add(new XYChart.Data<>("2016-11-25", 212.20));
        series25.getData().add(new XYChart.Data<>("2016-11-28", 209.60));
        series25.getData().add(new XYChart.Data<>("2016-11-29", 208.85));
        series25.getData().add(new XYChart.Data<>("2016-11-30", 208.70));
        series25.getData().add(new XYChart.Data<>("2016-12-01", 205.55));
        series25.getData().add(new XYChart.Data<>("2016-12-02", 206.75));
        series25.getData().add(new XYChart.Data<>("2016-12-05", 212.40));
        series25.getData().add(new XYChart.Data<>("2016-12-06", 210.55));
        series25.getData().add(new XYChart.Data<>("2016-12-07", 213.30));
        series25.getData().add(new XYChart.Data<>("2016-12-08", 216.95));
        series25.getData().add(new XYChart.Data<>("2016-12-09", 218.10));
        series25.getData().add(new XYChart.Data<>("2016-12-12", 212.85));
        series25.getData().add(new XYChart.Data<>("2016-12-13", 204.85));
        series25.getData().add(new XYChart.Data<>("2016-12-14", 205.75));
        series25.getData().add(new XYChart.Data<>("2016-12-15", 204.90));
        series25.getData().add(new XYChart.Data<>("2016-12-16", 200.40));
        series25.getData().add(new XYChart.Data<>("2016-12-19", 202.30));
        series25.getData().add(new XYChart.Data<>("2016-12-20", 204.65));
        series25.getData().add(new XYChart.Data<>("2016-12-21", 204.25));
        series25.getData().add(new XYChart.Data<>("2016-12-22", 203.70));
        series25.getData().add(new XYChart.Data<>("2016-12-23", 205.85));
        series25.getData().add(new XYChart.Data<>("2016-12-26", 205.85));
        series25.getData().add(new XYChart.Data<>("2016-12-27", 205.85));
        series25.getData().add(new XYChart.Data<>("2016-12-28", 204.40));
        series25.getData().add(new XYChart.Data<>("2016-12-29", 206.40));
        series25.getData().add(new XYChart.Data<>("2016-12-30", 206.85));
        series25.getData().add(new XYChart.Data<>("2017-01-02", 206.85));
        series25.getData().add(new XYChart.Data<>("2017-01-03", 206.15));
        series25.getData().add(new XYChart.Data<>("2017-01-04", 205.50));
        series25.getData().add(new XYChart.Data<>("2017-01-05", 199.05));
        series25.getData().add(new XYChart.Data<>("2017-01-06", 199.50));
        series25.getData().add(new XYChart.Data<>("2017-01-09", 200.95));
        series25.getData().add(new XYChart.Data<>("2017-01-10", 213.00));
        series25.getData().add(new XYChart.Data<>("2017-01-11", 208.80));
        series25.getData().add(new XYChart.Data<>("2017-01-12", 206.50));
        series25.getData().add(new XYChart.Data<>("2017-01-13", 206.00));
        series25.getData().add(new XYChart.Data<>("2017-01-16", 203.30));
        series25.getData().add(new XYChart.Data<>("2017-01-17", 202.00));
        series25.getData().add(new XYChart.Data<>("2017-01-18", 201.65));
        series25.getData().add(new XYChart.Data<>("2017-01-19", 202.60));
        series25.getData().add(new XYChart.Data<>("2017-01-20", 198.30));
        series25.getData().add(new XYChart.Data<>("2017-01-23", 195.00));
        series25.getData().add(new XYChart.Data<>("2017-01-24", 192.15));
        series25.getData().add(new XYChart.Data<>("2017-01-25", 188.45));
        series25.getData().add(new XYChart.Data<>("2017-01-26", 189.00));
        series25.getData().add(new XYChart.Data<>("2017-01-27", 206.55));
        series25.getData().add(new XYChart.Data<>("2017-01-30", 197.80));
        series25.getData().add(new XYChart.Data<>("2017-01-31", 194.60));
        series25.getData().add(new XYChart.Data<>("2017-02-01", 195.25));
        series25.getData().add(new XYChart.Data<>("2017-02-02", 196.85));
        series25.getData().add(new XYChart.Data<>("2017-02-03", 197.30));
        series25.getData().add(new XYChart.Data<>("2017-02-06", 193.05));
        series25.getData().add(new XYChart.Data<>("2017-02-07", 193.65));
        series25.getData().add(new XYChart.Data<>("2017-02-08", 197.60));
        series25.getData().add(new XYChart.Data<>("2017-02-09", 197.90));
        series25.getData().add(new XYChart.Data<>("2017-02-10", 198.00));
        chart25.getData().add(series25);
        
        XYChart.Series<String, Number> series26 = new XYChart.Series<>();
        series26.setName("Series 1");
        series26.getData().add(new XYChart.Data<>("2016-11-14", 958.834));
        series26.getData().add(new XYChart.Data<>("2016-11-15", 966.399));
        series26.getData().add(new XYChart.Data<>("2016-11-16", 973.964));
        series26.getData().add(new XYChart.Data<>("2016-11-17", 946.541));
        series26.getData().add(new XYChart.Data<>("2016-11-18", 977.746));
        series26.getData().add(new XYChart.Data<>("2016-11-21", 985.311));
        series26.getData().add(new XYChart.Data<>("2016-11-22", 1001.386));
        series26.getData().add(new XYChart.Data<>("2016-11-23", 995.712));
        series26.getData().add(new XYChart.Data<>("2016-11-24", 999.495));
        series26.getData().add(new XYChart.Data<>("2016-11-25", 997.604));
        series26.getData().add(new XYChart.Data<>("2016-11-28", 982.474));
        series26.getData().add(new XYChart.Data<>("2016-11-29", 995.712));
        series26.getData().add(new XYChart.Data<>("2016-11-30", 996.658));
        series26.getData().add(new XYChart.Data<>("2016-12-01", 1000.44));
        series26.getData().add(new XYChart.Data<>("2016-12-02", 978.692));
        series26.getData().add(new XYChart.Data<>("2016-12-05", 991.93));
        series26.getData().add(new XYChart.Data<>("2016-12-06", 985.311));
        series26.getData().add(new XYChart.Data<>("2016-12-07", 1006.114));
        series26.getData().add(new XYChart.Data<>("2016-12-08", 1039.21));
        series26.getData().add(new XYChart.Data<>("2016-12-09", 1018.407));
        series26.getData().add(new XYChart.Data<>("2016-12-12", 993.821));
        series26.getData().add(new XYChart.Data<>("2016-12-13", 1014.624));
        series26.getData().add(new XYChart.Data<>("2016-12-14", 1018.407));
        series26.getData().add(new XYChart.Data<>("2016-12-15", 1035.427));
        series26.getData().add(new XYChart.Data<>("2016-12-16", 1048.666));
        series26.getData().add(new XYChart.Data<>("2016-12-19", 1061.904));
        series26.getData().add(new XYChart.Data<>("2016-12-20", 1067.578));
        series26.getData().add(new XYChart.Data<>("2016-12-21", 1054.339));
        series26.getData().add(new XYChart.Data<>("2016-12-22", 1077.034));
        series26.getData().add(new XYChart.Data<>("2016-12-23", 1085.544));
        series26.getData().add(new XYChart.Data<>("2016-12-26", 1085.544));
        series26.getData().add(new XYChart.Data<>("2016-12-27", 1085.544));
        series26.getData().add(new XYChart.Data<>("2016-12-28", 1074.197));
        series26.getData().add(new XYChart.Data<>("2016-12-29", 1079.87));
        series26.getData().add(new XYChart.Data<>("2016-12-30", 1099.728));
        series26.getData().add(new XYChart.Data<>("2017-01-02", 1099.728));
        series26.getData().add(new XYChart.Data<>("2017-01-03", 1095.946));
        series26.getData().add(new XYChart.Data<>("2017-01-04", 1103.51));
        series26.getData().add(new XYChart.Data<>("2017-01-05", 1107.293));
        series26.getData().add(new XYChart.Data<>("2017-01-06", 1101.619));
        series26.getData().add(new XYChart.Data<>("2017-01-09", 1112.966));
        series26.getData().add(new XYChart.Data<>("2017-01-10", 1126.205));
        series26.getData().add(new XYChart.Data<>("2017-01-11", 1075.142));
        series26.getData().add(new XYChart.Data<>("2017-01-12", 1062.85));
        series26.getData().add(new XYChart.Data<>("2017-01-13", 1078.925));
        series26.getData().add(new XYChart.Data<>("2017-01-16", 1068.523));
        series26.getData().add(new XYChart.Data<>("2017-01-17", 1046.775));
        series26.getData().add(new XYChart.Data<>("2017-01-18", 1066.632));
        series26.getData().add(new XYChart.Data<>("2017-01-19", 1069.469));
        series26.getData().add(new XYChart.Data<>("2017-01-20", 1070.415));
        series26.getData().add(new XYChart.Data<>("2017-01-23", 1082.707));
        series26.getData().add(new XYChart.Data<>("2017-01-24", 1075.142));
        series26.getData().add(new XYChart.Data<>("2017-01-25", 1087.435));
        series26.getData().add(new XYChart.Data<>("2017-01-26", 1089.326));
        series26.getData().add(new XYChart.Data<>("2017-01-27", 1096.891));
        series26.getData().add(new XYChart.Data<>("2017-01-30", 1095.00));
        series26.getData().add(new XYChart.Data<>("2017-01-31", 1098.782));
        series26.getData().add(new XYChart.Data<>("2017-02-01", 1090.272));
        series26.getData().add(new XYChart.Data<>("2017-02-02", 1098.782));
        series26.getData().add(new XYChart.Data<>("2017-02-03", 1114.858));
        series26.getData().add(new XYChart.Data<>("2017-02-06", 1115.803));
        series26.getData().add(new XYChart.Data<>("2017-02-07", 1113.912));
        series26.getData().add(new XYChart.Data<>("2017-02-08", 1124.313));
        series26.getData().add(new XYChart.Data<>("2017-02-09", 1101.619));
        series26.getData().add(new XYChart.Data<>("2017-02-10", 1095.00));
        chart26.getData().add(series26);
        
        XYChart.Series<String, Number> series27 = new XYChart.Series<>();
        series27.setName("Series 1");
        series27.getData().add(new XYChart.Data<>("2016-11-14", 199.765));
        series27.getData().add(new XYChart.Data<>("2016-11-15", 197.617));
        series27.getData().add(new XYChart.Data<>("2016-11-16", 198.203));
        series27.getData().add(new XYChart.Data<>("2016-11-17", 200.498));
        series27.getData().add(new XYChart.Data<>("2016-11-18", 200.058));
        series27.getData().add(new XYChart.Data<>("2016-11-21", 197.373));
        series27.getData().add(new XYChart.Data<>("2016-11-22", 198.252));
        series27.getData().add(new XYChart.Data<>("2016-11-23", 195.86));
        series27.getData().add(new XYChart.Data<>("2016-11-24", 199.40));
        series27.getData().add(new XYChart.Data<>("2016-11-25", 198.95));
        series27.getData().add(new XYChart.Data<>("2016-11-28", 195.25));
        series27.getData().add(new XYChart.Data<>("2016-11-29", 194.25));
        series27.getData().add(new XYChart.Data<>("2016-11-30", 193.90));
        series27.getData().add(new XYChart.Data<>("2016-12-01", 191.00));
        series27.getData().add(new XYChart.Data<>("2016-12-02", 191.40));
        series27.getData().add(new XYChart.Data<>("2016-12-05", 190.45));
        series27.getData().add(new XYChart.Data<>("2016-12-06", 191.75));
        series27.getData().add(new XYChart.Data<>("2016-12-07", 195.15));
        series27.getData().add(new XYChart.Data<>("2016-12-08", 198.35));
        series27.getData().add(new XYChart.Data<>("2016-12-09", 198.40));
        series27.getData().add(new XYChart.Data<>("2016-12-12", 198.00));
        series27.getData().add(new XYChart.Data<>("2016-12-13", 200.75));
        series27.getData().add(new XYChart.Data<>("2016-12-14", 198.90));
        series27.getData().add(new XYChart.Data<>("2016-12-15", 198.35));
        series27.getData().add(new XYChart.Data<>("2016-12-16", 200.45));
        series27.getData().add(new XYChart.Data<>("2016-12-19", 202.35));
        series27.getData().add(new XYChart.Data<>("2016-12-20", 200.95));
        series27.getData().add(new XYChart.Data<>("2016-12-21", 199.60));
        series27.getData().add(new XYChart.Data<>("2016-12-22", 199.75));
        series27.getData().add(new XYChart.Data<>("2016-12-23", 200.55));
        series27.getData().add(new XYChart.Data<>("2016-12-26", 200.55));
        series27.getData().add(new XYChart.Data<>("2016-12-27", 200.55));
        series27.getData().add(new XYChart.Data<>("2016-12-28", 199.40));
        series27.getData().add(new XYChart.Data<>("2016-12-29", 200.40));
        series27.getData().add(new XYChart.Data<>("2016-12-30", 199.85));
        series27.getData().add(new XYChart.Data<>("2017-01-02", 199.85));
        series27.getData().add(new XYChart.Data<>("2017-01-03", 202.40));
        series27.getData().add(new XYChart.Data<>("2017-01-04", 205.70));
        series27.getData().add(new XYChart.Data<>("2017-01-05", 209.40));
        series27.getData().add(new XYChart.Data<>("2017-01-06", 211.35));
        series27.getData().add(new XYChart.Data<>("2017-01-09", 207.95));
        series27.getData().add(new XYChart.Data<>("2017-01-10", 210.25));
        series27.getData().add(new XYChart.Data<>("2017-01-11", 213.10));
        series27.getData().add(new XYChart.Data<>("2017-01-12", 214.35));
        series27.getData().add(new XYChart.Data<>("2017-01-13", 214.70));
        series27.getData().add(new XYChart.Data<>("2017-01-16", 210.50));
        series27.getData().add(new XYChart.Data<>("2017-01-17", 207.65));
        series27.getData().add(new XYChart.Data<>("2017-01-18", 207.60));
        series27.getData().add(new XYChart.Data<>("2017-01-19", 206.10));
        series27.getData().add(new XYChart.Data<>("2017-01-20", 206.05));
        series27.getData().add(new XYChart.Data<>("2017-01-23", 203.20));
        series27.getData().add(new XYChart.Data<>("2017-01-24", 199.35));
        series27.getData().add(new XYChart.Data<>("2017-01-25", 192.90));
        series27.getData().add(new XYChart.Data<>("2017-01-26", 192.50));
        series27.getData().add(new XYChart.Data<>("2017-01-27", 193.35));
        series27.getData().add(new XYChart.Data<>("2017-01-30", 195.95));
        series27.getData().add(new XYChart.Data<>("2017-01-31", 194.35));
        series27.getData().add(new XYChart.Data<>("2017-02-01", 193.00));
        series27.getData().add(new XYChart.Data<>("2017-02-02", 193.20));
        series27.getData().add(new XYChart.Data<>("2017-02-03", 194.10));
        series27.getData().add(new XYChart.Data<>("2017-02-06", 192.85));
        series27.getData().add(new XYChart.Data<>("2017-02-07", 192.45));
        series27.getData().add(new XYChart.Data<>("2017-02-08", 195.90));
        series27.getData().add(new XYChart.Data<>("2017-02-09", 199.10));
        series27.getData().add(new XYChart.Data<>("2017-02-10", 197.70));
        chart27.getData().add(series27);

        XYChart.Series<String, Number> series28 = new XYChart.Series<>();
        series28.setName("Series 1");
        series28.getData().add(new XYChart.Data<>("2016-11-14", 266.40));
        series28.getData().add(new XYChart.Data<>("2016-11-15", 264.50));
        series28.getData().add(new XYChart.Data<>("2016-11-16", 265.30));
        series28.getData().add(new XYChart.Data<>("2016-11-17", 271.10));
        series28.getData().add(new XYChart.Data<>("2016-11-18", 275.70));
        series28.getData().add(new XYChart.Data<>("2016-11-21", 273.90));
        series28.getData().add(new XYChart.Data<>("2016-11-22", 272.30));
        series28.getData().add(new XYChart.Data<>("2016-11-23", 267.70));
        series28.getData().add(new XYChart.Data<>("2016-11-24", 269.40));
        series28.getData().add(new XYChart.Data<>("2016-11-25", 269.10));
        series28.getData().add(new XYChart.Data<>("2016-11-28", 269.60));
        series28.getData().add(new XYChart.Data<>("2016-11-29", 271.50));
        series28.getData().add(new XYChart.Data<>("2016-11-30", 269.20));
        series28.getData().add(new XYChart.Data<>("2016-12-01", 263.10));
        series28.getData().add(new XYChart.Data<>("2016-12-02", 259.80));
        series28.getData().add(new XYChart.Data<>("2016-12-05", 259.20));
        series28.getData().add(new XYChart.Data<>("2016-12-06", 258.80));
        series28.getData().add(new XYChart.Data<>("2016-12-07", 256.60));
        series28.getData().add(new XYChart.Data<>("2016-12-08", 258.90));
        series28.getData().add(new XYChart.Data<>("2016-12-09", 265.80));
        series28.getData().add(new XYChart.Data<>("2016-12-12", 260.00));
        series28.getData().add(new XYChart.Data<>("2016-12-13", 267.20));
        series28.getData().add(new XYChart.Data<>("2016-12-14", 263.80));
        series28.getData().add(new XYChart.Data<>("2016-12-15", 269.30));
        series28.getData().add(new XYChart.Data<>("2016-12-16", 268.20));
        series28.getData().add(new XYChart.Data<>("2016-12-19", 266.70));
        series28.getData().add(new XYChart.Data<>("2016-12-20", 266.60));
        series28.getData().add(new XYChart.Data<>("2016-12-21", 263.90));
        series28.getData().add(new XYChart.Data<>("2016-12-22", 266.80));
        series28.getData().add(new XYChart.Data<>("2016-12-23", 267.70));
        series28.getData().add(new XYChart.Data<>("2016-12-26", 267.70));
        series28.getData().add(new XYChart.Data<>("2016-12-27", 267.70));
        series28.getData().add(new XYChart.Data<>("2016-12-28", 267.30));
        series28.getData().add(new XYChart.Data<>("2016-12-29", 267.50));
        series28.getData().add(new XYChart.Data<>("2016-12-30", 269.90));
        series28.getData().add(new XYChart.Data<>("2016-01-02", 269.90));
        series28.getData().add(new XYChart.Data<>("2017-01-03", 271.00));
        series28.getData().add(new XYChart.Data<>("2017-01-04", 271.70));
        series28.getData().add(new XYChart.Data<>("2017-01-05", 278.10));
        series28.getData().add(new XYChart.Data<>("2017-01-06", 281.10));
        series28.getData().add(new XYChart.Data<>("2017-01-09", 285.90));
        series28.getData().add(new XYChart.Data<>("2017-01-10", 284.20));
        series28.getData().add(new XYChart.Data<>("2017-01-11", 291.00));
        series28.getData().add(new XYChart.Data<>("2017-01-12", 288.30));
        series28.getData().add(new XYChart.Data<>("2017-01-13", 292.60));
        series28.getData().add(new XYChart.Data<>("2017-01-16", 289.00));
        series28.getData().add(new XYChart.Data<>("2017-01-17", 283.80));
        series28.getData().add(new XYChart.Data<>("2017-01-18", 285.00));
        series28.getData().add(new XYChart.Data<>("2017-01-19", 287.40));
        series28.getData().add(new XYChart.Data<>("2017-01-20", 285.70));
        series28.getData().add(new XYChart.Data<>("2017-01-23", 284.50));
        series28.getData().add(new XYChart.Data<>("2017-01-24", 284.70));
        series28.getData().add(new XYChart.Data<>("2017-01-25", 283.30));
        series28.getData().add(new XYChart.Data<>("2017-01-26", 280.80));
        series28.getData().add(new XYChart.Data<>("2017-01-27", 282.00));
        series28.getData().add(new XYChart.Data<>("2017-01-30", 284.80));
        series28.getData().add(new XYChart.Data<>("2017-01-31", 285.90));
        series28.getData().add(new XYChart.Data<>("2017-02-01", 287.70));
        series28.getData().add(new XYChart.Data<>("2017-02-02", 280.10));
        series28.getData().add(new XYChart.Data<>("2017-02-03", 282.60));
        series28.getData().add(new XYChart.Data<>("2017-02-06", 278.90));
        series28.getData().add(new XYChart.Data<>("2017-02-07", 280.80));
        series28.getData().add(new XYChart.Data<>("2017-02-08", 281.30));
        series28.getData().add(new XYChart.Data<>("2017-02-09", 274.00));
        series28.getData().add(new XYChart.Data<>("2017-02-10", 272.00));
        chart28.getData().add(series28);
        
        initiateCols();
        loadData();
    }
    //End of reference.
    
    private void initiateCols(){
    	stocksymbol.setCellValueFactory(new PropertyValueFactory<>("stocksymbol"));
    	companyname.setCellValueFactory(new PropertyValueFactory<>("companyname"));
    	latestshareprice.setCellValueFactory(new PropertyValueFactory<>("latestshareprice"));
    }
    public void loadData() {
    	list.removeAll(list);
    	list.addAll(new Stockviewer("AHT","Ashtead Group plc","1644.00"));
    	list.addAll(new Stockviewer("ANTO","Antofagasta plc","866.00"));
    	list.addAll(new Stockviewer("BA","BAE Systems plc","612.00"));
    	list.addAll(new Stockviewer("BATS","British American Tobacco plc","5008.00"));
    	list.addAll(new Stockviewer("CCH","Coca-Cola HBC AG", "1826.00"));
    	list.addAll(new Stockviewer("CCL","Carnival plc","4301.00"));
    	list.addAll(new Stockviewer("CNA","Centrica plc","234.00"));
    	list.addAll(new Stockviewer("CPG","Compass Group plc","1445.00"));
    	list.addAll(new Stockviewer("EXPN","Experian plc","1565.00"));
    	list.addAll(new Stockviewer("EZJ","EasyJet plc","893.70"));
    	list.addAll(new Stockviewer("GKN","GKN plc","340.90"));
    	list.addAll(new Stockviewer("MDC","Mediclinic International plc","835.50"));
    	list.addAll(new Stockviewer("PFG","Provident Financial plc","2779.00"));
    	list.addAll(new Stockviewer("PPB","Paddy Power Betfair plc","8700.00"));
    	list.addAll(new Stockviewer("PRU","Prudential plc","1620.50"));
    	list.addAll(new Stockviewer("PSN","Persimmon plc","1967.00"));
    	list.addAll(new Stockviewer("RB","Reckitt Benckiser Group plc","6930.00"));
    	list.addAll(new Stockviewer("RDSA","Royal Dutch Shell plc","5008.00"));
    	list.addAll(new Stockviewer("RR","Rolls-Royce Holdings plc","732.50"));
    	list.addAll(new Stockviewer("SDR","Schroders plc","3041.00"));
    	list.addAll(new Stockviewer("SHP","Shire plc","4595.00"));
    	list.addAll(new Stockviewer("SKY","Sky plc","1000.00"));
    	list.addAll(new Stockviewer("SSE","SSE plc","1537.00"));
    	list.addAll(new Stockviewer("STJ","St.James's Place","1083.00"));
    	list.addAll(new Stockviewer("TSCO","Tesco plc","198.00"));
    	list.addAll(new Stockviewer("TUI","TUI AG","1095.00"));
    	list.addAll(new Stockviewer("VOD","Vodafone Group plc","197.70"));
    	list.addAll(new Stockviewer("WPG","Worldplay Group plc","272.00"));
    	stockview.getItems().addAll(list);
    }
    
    public static class Stockviewer{
    	private final String stocksymbol;
    	private final String companyname;
    	private final String latestshareprice;
    	public Stockviewer(String stocksymbol, String companyname, String latestshareprice) {
    		this.stocksymbol = new String(stocksymbol);
    		this.companyname = new String(companyname);
    		this.latestshareprice = new String(latestshareprice);
    	}

		public String getStocksymbol() {
			return stocksymbol;
		}
		public String getCompanyname() {
			return companyname;
		}
		public String getLatestshareprice() {
			return latestshareprice;
		}
    }
        
    private List<AHT> InsertAHT() {
    	List<AHT> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/AHT.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            AHT r = new AHT();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate(items[0]);
	                r.setOpen(items[1]);
	                r.setHigh(items[2]);
	                r.setLow(items[3]);
	                r.setClose(items[4]);
	                r.setVolume(items[5]);
	                r.setAdjclose(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    //Reading from file into tableview.
    //Adapted from coderanch.com
    //Accessed 31/03/19.
    //https://coderanch.com/t/522114/java/reading-file
    private List<ANTO> InsertANTO() {
    	List<ANTO> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/ANTO.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            ANTO r = new ANTO();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate2(items[0]);
	                r.setOpen2(items[1]);
	                r.setHigh2(items[2]);
	                r.setLow2(items[3]);
	                r.setClose2(items[4]);
	                r.setVolume2(items[5]);
	                r.setAdjclose2(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<BA> InsertBA() {
    	List<BA> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/BA.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            BA r = new BA();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate3(items[0]);
	                r.setOpen3(items[1]);
	                r.setHigh3(items[2]);
	                r.setLow3(items[3]);
	                r.setClose3(items[4]);
	                r.setVolume3(items[5]);
	                r.setAdjclose3(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<BATS> InsertBATS() {
    	List<BATS> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/BATS.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            BATS r = new BATS();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate4(items[0]);
	                r.setOpen4(items[1]);
	                r.setHigh4(items[2]);
	                r.setLow4(items[3]);
	                r.setClose4(items[4]);
	                r.setVolume4(items[5]);
	                r.setAdjclose4(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<CCH> InsertCCH() {
    	List<CCH> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/CCH.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            CCH r = new CCH();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate5(items[0]);
	                r.setOpen5(items[1]);
	                r.setHigh5(items[2]);
	                r.setLow5(items[3]);
	                r.setClose5(items[4]);
	                r.setVolume5(items[5]);
	                r.setAdjclose5(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<CCL> InsertCCL() {
    	List<CCL> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/CCL.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            CCL r = new CCL();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate6(items[0]);
	                r.setOpen6(items[1]);
	                r.setHigh6(items[2]);
	                r.setLow6(items[3]);
	                r.setClose6(items[4]);
	                r.setVolume6(items[5]);
	                r.setAdjclose6(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<CNA> InsertCNA() {
    	List<CNA> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/CNA.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            CNA r = new CNA();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate7(items[0]);
	                r.setOpen7(items[1]);
	                r.setHigh7(items[2]);
	                r.setLow7(items[3]);
	                r.setClose7(items[4]);
	                r.setVolume7(items[5]);
	                r.setAdjclose7(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<CPG> InsertCPG() {
    	List<CPG> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/CPG.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            CPG r = new CPG();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate8(items[0]);
	                r.setOpen8(items[1]);
	                r.setHigh8(items[2]);
	                r.setLow8(items[3]);
	                r.setClose8(items[4]);
	                r.setVolume8(items[5]);
	                r.setAdjclose8(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<EXPN> InsertEXPN() {
    	List<EXPN> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/EXPN.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            EXPN r = new EXPN();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate9(items[0]);
	                r.setOpen9(items[1]);
	                r.setHigh9(items[2]);
	                r.setLow9(items[3]);
	                r.setClose9(items[4]);
	                r.setVolume9(items[5]);
	                r.setAdjclose9(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<EZJ> InsertEZJ() {
    	List<EZJ> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/EZJ.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            EZJ r = new EZJ();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate10(items[0]);
	                r.setOpen10(items[1]);
	                r.setHigh10(items[2]);
	                r.setLow10(items[3]);
	                r.setClose10(items[4]);
	                r.setVolume10(items[5]);
	                r.setAdjclose10(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }    
    
    private List<GKN> InsertGKN() {
    	List<GKN> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/GKN.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            GKN r = new GKN();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate11(items[0]);
	                r.setOpen11(items[1]);
	                r.setHigh11(items[2]);
	                r.setLow11(items[3]);
	                r.setClose11(items[4]);
	                r.setVolume11(items[5]);
	                r.setAdjclose11(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<MDC> InsertMDC() {
    	List<MDC> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/MDC.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            MDC r = new MDC();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate12(items[0]);
	                r.setOpen12(items[1]);
	                r.setHigh12(items[2]);
	                r.setLow12(items[3]);
	                r.setClose12(items[4]);
	                r.setVolume12(items[5]);
	                r.setAdjclose12(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<PFG> InsertPFG() {
    	List<PFG> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/PFG.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            PFG r = new PFG();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate13(items[0]);
	                r.setOpen13(items[1]);
	                r.setHigh13(items[2]);
	                r.setLow13(items[3]);
	                r.setClose13(items[4]);
	                r.setVolume13(items[5]);
	                r.setAdjclose13(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }     
    
    private List<PPB> InsertPPB() {
    	List<PPB> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/PPB.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            PPB r = new PPB();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate14(items[0]);
	                r.setOpen14(items[1]);
	                r.setHigh14(items[2]);
	                r.setLow14(items[3]);
	                r.setClose14(items[4]);
	                r.setVolume14(items[5]);
	                r.setAdjclose14(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }         
    
    private List<PRU> InsertPRU() {
    	List<PRU> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/PRU.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            PRU r = new PRU();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate15(items[0]);
	                r.setOpen15(items[1]);
	                r.setHigh15(items[2]);
	                r.setLow15(items[3]);
	                r.setClose15(items[4]);
	                r.setVolume15(items[5]);
	                r.setAdjclose15(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    } 
    
    private List<PSN> InsertPSN() {
    	List<PSN> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/PSN.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            PSN r = new PSN();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate16(items[0]);
	                r.setOpen16(items[1]);
	                r.setHigh16(items[2]);
	                r.setLow16(items[3]);
	                r.setClose16(items[4]);
	                r.setVolume16(items[5]);
	                r.setAdjclose16(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }  
    
    private List<RB> InsertRB() {
    	List<RB> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/RB.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            RB r = new RB();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate17(items[0]);
	                r.setOpen17(items[1]);
	                r.setHigh17(items[2]);
	                r.setLow17(items[3]);
	                r.setClose17(items[4]);
	                r.setVolume17(items[5]);
	                r.setAdjclose17(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }     
    
    private List<RDSA> InsertRDSA() {
    	List<RDSA> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/RDSA.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            RDSA r = new RDSA();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate18(items[0]);
	                r.setOpen18(items[1]);
	                r.setHigh18(items[2]);
	                r.setLow18(items[3]);
	                r.setClose18(items[4]);
	                r.setVolume18(items[5]);
	                r.setAdjclose18(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }     
    
    private List<RR> InsertRR() {
    	List<RR> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/RR.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            RR r = new RR();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate19(items[0]);
	                r.setOpen19(items[1]);
	                r.setHigh19(items[2]);
	                r.setLow19(items[3]);
	                r.setClose19(items[4]);
	                r.setVolume19(items[5]);
	                r.setAdjclose19(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<SDR> InsertSDR() {
    	List<SDR> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/SDR.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            SDR r = new SDR();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate20(items[0]);
	                r.setOpen20(items[1]);
	                r.setHigh20(items[2]);
	                r.setLow20(items[3]);
	                r.setClose20(items[4]);
	                r.setVolume20(items[5]);
	                r.setAdjclose20(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<SHP> InsertSHP() {
    	List<SHP> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/SHP.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            SHP r = new SHP();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate21(items[0]);
	                r.setOpen21(items[1]);
	                r.setHigh21(items[2]);
	                r.setLow21(items[3]);
	                r.setClose21(items[4]);
	                r.setVolume21(items[5]);
	                r.setAdjclose21(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<SKY> InsertSKY() {
    	List<SKY> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/SKY.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            SKY r = new SKY();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate22(items[0]);
	                r.setOpen22(items[1]);
	                r.setHigh22(items[2]);
	                r.setLow22(items[3]);
	                r.setClose22(items[4]);
	                r.setVolume22(items[5]);
	                r.setAdjclose22(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<SSE> InsertSSE() {
    	List<SSE> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/SSE.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            SSE r = new SSE();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate23(items[0]);
	                r.setOpen23(items[1]);
	                r.setHigh23(items[2]);
	                r.setLow23(items[3]);
	                r.setClose23(items[4]);
	                r.setVolume23(items[5]);
	                r.setAdjclose23(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<STJ> InsertSTJ() {
    	List<STJ> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/STJ.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            STJ r = new STJ();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate24(items[0]);
	                r.setOpen24(items[1]);
	                r.setHigh24(items[2]);
	                r.setLow24(items[3]);
	                r.setClose24(items[4]);
	                r.setVolume24(items[5]);
	                r.setAdjclose24(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<TSCO> InsertTSCO() {
    	List<TSCO> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/TSCO.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            TSCO r = new TSCO();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate25(items[0]);
	                r.setOpen25(items[1]);
	                r.setHigh25(items[2]);
	                r.setLow25(items[3]);
	                r.setClose25(items[4]);
	                r.setVolume25(items[5]);
	                r.setAdjclose25(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<TUI> InsertTUI() {
    	List<TUI> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/TUI.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            TUI r = new TUI();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate26(items[0]);
	                r.setOpen26(items[1]);
	                r.setHigh26(items[2]);
	                r.setLow26(items[3]);
	                r.setClose26(items[4]);
	                r.setVolume26(items[5]);
	                r.setAdjclose26(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<VOD> InsertVOD() {
    	List<VOD> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/VOD.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            VOD r = new VOD();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate27(items[0]);
	                r.setOpen27(items[1]);
	                r.setHigh27(items[2]);
	                r.setLow27(items[3]);
	                r.setClose27(items[4]);
	                r.setVolume27(items[5]);
	                r.setAdjclose27(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    
    private List<WPG> InsertWPG() {
    	List<WPG> row = new ArrayList<>();
    	try {
    	FileReader fr = new FileReader("src/application/WPG.csv");
    	 
    	BufferedReader reader = new BufferedReader(fr);
    	String line= reader.readLine();
    	String[] items;
    	String[] l;
    	int i = 0;
    	while ((line = reader.readLine()) != null) {
	            WPG r = new WPG();
	          
	            items = line.split(",");
	            System.out.println(items);
	                r.setDate28(items[0]);
	                r.setOpen28(items[1]);
	                r.setHigh28(items[2]);
	                r.setLow28(items[3]);
	                r.setClose28(items[4]);
	                r.setVolume28(items[5]);
	                r.setAdjclose28(items[6]);
	                row.add(r);
	            
    	}

		        } catch (Exception e) {
		            e.printStackTrace();
		            return null;
		        }
		      return row;
		    }
    //End of reference.
    
    //Getters and setters.
    public class AHT {
    	
    	private String date;
    	
    	private String open;
    	
    	private String high;
    	
    	private String low;
    	
    	private String close;
    	
    	private String volume;
    	
    	private String adjclose;
    	 	
    	public String getDate() {
    		return date;
    	}
    	
    	public void setDate(String date) {
    		this.date = date;
    	}
    	
    	public String getOpen() {
    		return open;
    	}
    	
    	public void setOpen(String open) {
    		this.open = open;
    	}    	    	
    	
    	public String getHigh() {
    		return high;
    	}
    	
    	public void setHigh(String high) {
    		this.high = high;
    	}
    	
    	public String getLow() {
    		return low;
    	}
    	
    	public void setLow(String low) {
    		this.low = low;
    	}
    	
    	public String getClose() {
    		return close;
    	}
    	
    	public void setClose(String close) {
    		this.close = close;
    	}
    	
    	public String getVolume() {
    		return volume;
    	}
    	
    	public void setVolume(String volume) {
    		this.volume = volume;
    	}
    	
    	public String getAdjclose() {
    		return adjclose;
    	}
    	
    	public void setAdjclose(String adjclose) {
    		this.adjclose = adjclose;
    	}    	
    	
    	public AHT() {
    	}
    }
    
    public class ANTO {
    	
    	private String date2;
    	
    	private String open2;
    	
    	private String high2;
    	
    	private String low2;
    	
    	private String close2;
    	
    	private String volume2;
    	
    	private String adjclose2;
    		
    	public String getDate2() {
    		return date2;
    	}
    	
    	public void setDate2(String date2) {
    		this.date2 = date2;
    	}
    	
    	public String getOpen2() {
    		return open2;
    	}
    	
    	public void setOpen2(String open2) {
    		this.open2 = open2;
    	}    	    	
    	
    	public String getHigh2() {
    		return high2;
    	}
    	
    	public void setHigh2(String high2) {
    		this.high2 = high2;
    	}
    	
    	public String getLow2() {
    		return low2;
    	}
    	
    	public void setLow2(String low2) {
    		this.low2 = low2;
    	}
    	
    	public String getClose2() {
    		return close2;
    	}
    	
    	public void setClose2(String close2) {
    		this.close2 = close2;
    	}
    	
    	public String getVolume2() {
    		return volume2;
    	}
    	
    	public void setVolume2(String volume2) {
    		this.volume2 = volume2;
    	}
    	
    	public String getAdjclose2() {
    		return adjclose2;
    	}
    	
    	public void setAdjclose2(String adjclose2) {
    		this.adjclose2 = adjclose2;
    	}    	
    	
    	public ANTO() {
    	}
    }
    
    public class BA {
    	
    	private String date3;
    	
    	private String open3;
    	
    	private String high3;
    	
    	private String low3;
    	
    	private String close3;
    	
    	private String volume3;
    	
    	private String adjclose3;
    		
    	public String getDate3() {
    		return date3;
    	}
    	
    	public void setDate3(String date3) {
    		this.date3 = date3;
    	}
    	
    	public String getOpen3() {
    		return open3;
    	}
    	
    	public void setOpen3(String open3) {
    		this.open3 = open3;
    	}    	    	
    	
    	public String getHigh3() {
    		return high3;
    	}
    	
    	public void setHigh3(String high3) {
    		this.high3 = high3;
    	}
    	
    	public String getLow3() {
    		return low3;
    	}
    	
    	public void setLow3(String low3) {
    		this.low3 = low3;
    	}
    	
    	public String getClose3() {
    		return close3;
    	}
    	
    	public void setClose3(String close3) {
    		this.close3 = close3;
    	}
    	
    	public String getVolume3() {
    		return volume3;
    	}
    	
    	public void setVolume3(String volume3) {
    		this.volume3 = volume3;
    	}
    	
    	public String getAdjclose3() {
    		return adjclose3;
    	}
    	
    	public void setAdjclose3(String adjclose3) {
    		this.adjclose3 = adjclose3;
    	}    	
    	
    	public BA() {
    	}
    }
    
    public class BATS {
    	
    	private String date4;
    	
    	private String open4;
    	
    	private String high4;
    	
    	private String low4;
    	
    	private String close4;
    	
    	private String volume4;
    	
    	private String adjclose4;
    		
    	public String getDate4() {
    		return date4;
    	}
    	
    	public void setDate4(String date4) {
    		this.date4 = date4;
    	}
    	
    	public String getOpen4() {
    		return open4;
    	}
    	
    	public void setOpen4(String open4) {
    		this.open4 = open4;
    	}    	    	
    	
    	public String getHigh4() {
    		return high4;
    	}
    	
    	public void setHigh4(String high4) {
    		this.high4 = high4;
    	}
    	
    	public String getLow4() {
    		return low4;
    	}
    	
    	public void setLow4(String low4) {
    		this.low4 = low4;
    	}
    	
    	public String getClose4() {
    		return close4;
    	}
    	
    	public void setClose4(String close4) {
    		this.close4 = close4;
    	}
    	
    	public String getVolume4() {
    		return volume4;
    	}
    	
    	public void setVolume4(String volume4) {
    		this.volume4 = volume4;
    	}
    	
    	public String getAdjclose4() {
    		return adjclose4;
    	}
    	
    	public void setAdjclose4(String adjclose4) {
    		this.adjclose4 = adjclose4;
    	}    	
    	
    	public BATS() {
    	}
    }

    public class CCH {
    	
    	private String date5;
    	
    	private String open5;
    	
    	private String high5;
    	
    	private String low5;
    	
    	private String close5;
    	
    	private String volume5;
    	
    	private String adjclose5;
    		
    	public String getDate5() {
    		return date5;
    	}
    	
    	public void setDate5(String date5) {
    		this.date5 = date5;
    	}
    	
    	public String getOpen5() {
    		return open5;
    	}
    	
    	public void setOpen5(String open5) {
    		this.open5 = open5;
    	}    	    	
    	
    	public String getHigh5() {
    		return high5;
    	}
    	
    	public void setHigh5(String high5) {
    		this.high5 = high5;
    	}
    	
    	public String getLow5() {
    		return low5;
    	}
    	
    	public void setLow5(String low5) {
    		this.low5 = low5;
    	}
    	
    	public String getClose5() {
    		return close5;
    	}
    	
    	public void setClose5(String close5) {
    		this.close5 = close5;
    	}
    	
    	public String getVolume5() {
    		return volume5;
    	}
    	
    	public void setVolume5(String volume5) {
    		this.volume5 = volume5;
    	}
    	
    	public String getAdjclose5() {
    		return adjclose5;
    	}
    	
    	public void setAdjclose5(String adjclose5) {
    		this.adjclose5 = adjclose5;
    	}    	
    	
    	public CCH() {
    	}
    }
    
    public class CCL {
    	
    	private String date6;
    	
    	private String open6;
    	
    	private String high6;
    	
    	private String low6;
    	
    	private String close6;
    	
    	private String volume6;
    	
    	private String adjclose6;
    		
    	public String getDate6() {
    		return date6;
    	}
    	
    	public void setDate6(String date6) {
    		this.date6 = date6;
    	}
    	
    	public String getOpen6() {
    		return open6;
    	}
    	
    	public void setOpen6(String open6) {
    		this.open6 = open6;
    	}    	    	
    	
    	public String getHigh6() {
    		return high6;
    	}
    	
    	public void setHigh6(String high6) {
    		this.high6 = high6;
    	}
    	
    	public String getLow6() {
    		return low6;
    	}
    	
    	public void setLow6(String low6) {
    		this.low6 = low6;
    	}
    	
    	public String getClose6() {
    		return close6;
    	}
    	
    	public void setClose6(String close6) {
    		this.close6 = close6;
    	}
    	
    	public String getVolume6() {
    		return volume6;
    	}
    	
    	public void setVolume6(String volume6) {
    		this.volume6 = volume6;
    	}
    	
    	public String getAdjclose6() {
    		return adjclose6;
    	}
    	
    	public void setAdjclose6(String adjclose6) {
    		this.adjclose6 = adjclose6;
    	}    	
    	
    	public CCL() {
    	}
    }

    public class CNA {
    	
    	private String date7;
    	
    	private String open7;
    	
    	private String high7;
    	
    	private String low7;
    	
    	private String close7;
    	
    	private String volume7;
    	
    	private String adjclose7;
    		
    	public String getDate7() {
    		return date7;
    	}
    	
    	public void setDate7(String date7) {
    		this.date7 = date7;
    	}
    	
    	public String getOpen7() {
    		return open7;
    	}
    	
    	public void setOpen7(String open7) {
    		this.open7 = open7;
    	}    	    	
    	
    	public String getHigh7() {
    		return high7;
    	}
    	
    	public void setHigh7(String high7) {
    		this.high7 = high7;
    	}
    	
    	public String getLow7() {
    		return low7;
    	}
    	
    	public void setLow7(String low7) {
    		this.low7 = low7;
    	}
    	
    	public String getClose7() {
    		return close7;
    	}
    	
    	public void setClose7(String close7) {
    		this.close7 = close7;
    	}
    	
    	public String getVolume7() {
    		return volume7;
    	}
    	
    	public void setVolume7(String volume7) {
    		this.volume7 = volume7;
    	}
    	
    	public String getAdjclose7() {
    		return adjclose7;
    	}
    	
    	public void setAdjclose7(String adjclose7) {
    		this.adjclose7 = adjclose7;
    	}    	
    	
    	public CNA() {
    	}
    }

    public class CPG {
    	
    	private String date8;
    	
    	private String open8;
    	
    	private String high8;
    	
    	private String low8;
    	
    	private String close8;
    	
    	private String volume8;
    	
    	private String adjclose8;
    		
    	public String getDate8() {
    		return date8;
    	}
    	
    	public void setDate8(String date8) {
    		this.date8 = date8;
    	}	
    	
    	public String getOpen8() {
    		return open8;
    	}
    	
    	public void setOpen8(String open8) {
    		this.open8 = open8;
    	}    	    	
    	
    	public String getHigh8() {
    		return high8;
    	}
    	
    	public void setHigh8(String high8) {
    		this.high8 = high8;
    	}
    	
    	public String getLow8() {
    		return low8;
    	}
    	
    	public void setLow8(String low8) {
    		this.low8 = low8;
    	}
    	
    	public String getClose8() {
    		return close8;
    	}
    	
    	public void setClose8(String close8) {
    		this.close8 = close8;
    	}
    	
    	public String getVolume8() {
    		return volume8;
    	}
    	
    	public void setVolume8(String volume8) {
    		this.volume8 = volume8;
    	}
    	
    	public String getAdjclose8() {
    		return adjclose8;
    	}
    	
    	public void setAdjclose8(String adjclose8) {
    		this.adjclose8 = adjclose8;
    	}    	
    	
    	public CPG() {
    	}
    }
    
    public class EXPN {
    	
    	private String date9;
    	
    	private String open9;
    	
    	private String high9;
    	
    	private String low9;
    	
    	private String close9;
    	
    	private String volume9;
    	
    	private String adjclose9;
    		
    	public String getDate9() {
    		return date9;
    	}
    	
    	public void setDate9(String date9) {
    		this.date9 = date9;
    	}
    	
    	public String getOpen9() {
    		return open9;
    	}
    	
    	public void setOpen9(String open9) {
    		this.open9 = open9;
    	}    	    	
    	
    	public String getHigh9() {
    		return high9;
    	}
    	
    	public void setHigh9(String high9) {
    		this.high9 = high9;
    	}
    	
    	public String getLow9() {
    		return low9;
    	}
    	
    	public void setLow9(String low9) {
    		this.low9 = low9;
    	}
    	
    	public String getClose9() {
    		return close9;
    	}
    	
    	public void setClose9(String close9) {
    		this.close9 = close9;
    	}
    	
    	public String getVolume9() {
    		return volume9;
    	}
    	
    	public void setVolume9(String volume9) {
    		this.volume9 = volume9;
    	}
    	
    	public String getAdjclose9() {
    		return adjclose9;
    	}
    	
    	public void setAdjclose9(String adjclose9) {
    		this.adjclose9 = adjclose9;
    	}    	
    	
    	public EXPN() {
    	}
    }
    
    public class EZJ {
    	
    	private String date10;
    	
    	private String open10;
    	
    	private String high10;
    	
    	private String low10;
    	
    	private String close10;
    	
    	private String volume10;
    	
    	private String adjclose10;
    		
    	public String getDate10() {
    		return date10;
    	}
    	
    	public void setDate10(String date10) {
    		this.date10 = date10;
    	}
    	
    	public String getOpen10() {
    		return open10;
    	}
    	
    	public void setOpen10(String open10) {
    		this.open10 = open10;
    	}    	    	
    	
    	public String getHigh10() {
    		return high10;
    	}
    	
    	public void setHigh10(String high10) {
    		this.high10 = high10;
    	}
    	
    	public String getLow10() {
    		return low10;
    	}
    	
    	public void setLow10(String low10) {
    		this.low10 = low10;
    	}
    	
    	public String getClose10() {
    		return close10;
    	}
    	
    	public void setClose10(String close10) {
    		this.close10 = close10;
    	}
    	
    	public String getVolume10() {
    		return volume10;
    	}
    	
    	public void setVolume10(String volume10) {
    		this.volume10 = volume10;
    	}
    	
    	public String getAdjclose10() {
    		return adjclose10;
    	}
    	
    	public void setAdjclose10(String adjclose10) {
    		this.adjclose10 = adjclose10;
    	}    	
    	
    	public EZJ() {
    	}
    }

    public class GKN {
    	
    	private String date11;
    	
    	private String open11;
    	
    	private String high11;
    	
    	private String low11;
    	
    	private String close11;
    	
    	private String volume11;
    	
    	private String adjclose11;
    		
    	public String getDate11() {
    		return date11;
    	}
    	
    	public void setDate11(String date11) {
    		this.date11 = date11;
    	}
    	
    	public String getOpen11() {
    		return open11;
    	}
    	
    	public void setOpen11(String open11) {
    		this.open11 = open11;
    	}    	    	
    	
    	public String getHigh11() {
    		return high11;
    	}
    	
    	public void setHigh11(String high11) {
    		this.high11 = high11;
    	}
    	
    	public String getLow11() {
    		return low11;
    	}
    	
    	public void setLow11(String low11) {
    		this.low11 = low11;
    	}
    	
    	public String getClose11() {
    		return close11;
    	}
    	
    	public void setClose11(String close11) {
    		this.close11 = close11;
    	}
    	
    	public String getVolume11() {
    		return volume11;
    	}
    	
    	public void setVolume11(String volume11) {
    		this.volume11 = volume11;
    	}
    	
    	public String getAdjclose11() {
    		return adjclose11;
    	}
    	
    	public void setAdjclose11(String adjclose11) {
    		this.adjclose11 = adjclose11;
    	}    	
    	
    	public GKN() {
    	}
    }
    
    public class MDC {
    	
    	private String date12;
    	
    	private String open12;
    	
    	private String high12;
    	
    	private String low12;
    	
    	private String close12;
    	
    	private String volume12;
    	
    	private String adjclose12;
    		
    	public String getDate12() {
    		return date12;
    	}
    	
    	public void setDate12(String date12) {
    		this.date12 = date12;
    	}
    	
    	public String getOpen12() {
    		return open12;
    	}
    	
    	public void setOpen12(String open12) {
    		this.open12 = open12;
    	}    	    	
    	
    	public String getHigh12() {
    		return high12;
    	}
    	
    	public void setHigh12(String high12) {
    		this.high12 = high12;
    	}
    	
    	public String getLow12() {
    		return low12;
    	}
    	
    	public void setLow12(String low12) {
    		this.low12 = low12;
    	}
    	
    	public String getClose12() {
    		return close12;
    	}
    	
    	public void setClose12(String close12) {
    		this.close12 = close12;
    	}
    	
    	public String getVolume12() {
    		return volume12;
    	}
    	
    	public void setVolume12(String volume12) {
    		this.volume12 = volume12;
    	}
    	
    	public String getAdjclose12() {
    		return adjclose12;
    	}
    	
    	public void setAdjclose12(String adjclose12) {
    		this.adjclose12 = adjclose12;
    	}    	
    	
    	public MDC() {
    	}
    }
    
    public class PFG {
    	
    	private String date13;
    	
    	private String open13;
    	
    	private String high13;
    	
    	private String low13;
    	
    	private String close13;
    	
    	private String volume13;
    	
    	private String adjclose13;
    		
    	public String getDate13() {
    		return date13;
    	}
    	
    	public void setDate13(String date13) {
    		this.date13 = date13;
    	}
    	
    	public String getOpen13() {
    		return open13;
    	}
    	
    	public void setOpen13(String open13) {
    		this.open13 = open13;
    	}    	    	
    	
    	public String getHigh13() {
    		return high13;
    	}
    	
    	public void setHigh13(String high13) {
    		this.high13 = high13;
    	}
    	
    	public String getLow13() {
    		return low13;
    	}
    	
    	public void setLow13(String low13) {
    		this.low13 = low13;
    	}
    	
    	public String getClose13() {
    		return close13;
    	}
    	
    	public void setClose13(String close13) {
    		this.close13 = close13;
    	}
    	
    	public String getVolume13() {
    		return volume13;
    	}
    	
    	public void setVolume13(String volume13) {
    		this.volume13 = volume13;
    	}
    	
    	public String getAdjclose13() {
    		return adjclose13;
    	}
    	
    	public void setAdjclose13(String adjclose13) {
    		this.adjclose13 = adjclose13;
    	}    	
    	
    	public PFG() {
    	}
    }
    
    public class PPB {
    	
    	private String date14;
    	
    	private String open14;
    	
    	private String high14;
    	
    	private String low14;
    	
    	private String close14;
    	
    	private String volume14;
    	
    	private String adjclose14;
    		
    	public String getDate14() {
    		return date14;
    	}
    	
    	public String getOpen14() {
    		return open14;
    	}
    	
    	public void setOpen14(String open14) {
    		this.open14 = open14;
    	}    	    	
    	
    	public String getHigh14() {
    		return high14;
    	}
    	
    	public void setHigh14(String high14) {
    		this.high14 = high14;
    	}
    	
    	public String getLow14() {
    		return low14;
    	}
    	
    	public void setLow14(String low14) {
    		this.low14 = low14;
    	}
    	
    	public String getClose14() {
    		return close14;
    	}
    	
    	public void setClose14(String close14) {
    		this.close14 = close14;
    	}
    	
    	public String getVolume14() {
    		return volume14;
    	}
    	
    	public void setVolume14(String volume14) {
    		this.volume14 = volume14;
    	}
    	
    	public void setDate14(String date14) {
    		this.date14 = date14;
    	}
    	
    	public String getAdjclose14() {
    		return adjclose14;
    	}
    	
    	public void setAdjclose14(String adjclose14) {
    		this.adjclose14 = adjclose14;
    	}    	
    	
    	public PPB() {
    	}
    }
    
    public class PRU {
    	
    	private String date15;
    	
    	private String open15;
    	
    	private String high15;
    	
    	private String low15;
    	
    	private String close15;
    	
    	private String volume15;
    	
    	private String adjclose15;
    		
    	public String getDate15() {
    		return date15;
    	}
    	
    	public void setDate15(String date15) {
    		this.date15 = date15;
    	}
    	
    	public String getOpen15() {
    		return open15;
    	}
    	
    	public void setOpen15(String open15) {
    		this.open15 = open15;
    	}    	    	
    	
    	public String getHigh15() {
    		return high15;
    	}
    	
    	public void setHigh15(String high15) {
    		this.high15 = high15;
    	}
    	
    	public String getLow15() {
    		return low15;
    	}
    	
    	public void setLow15(String low15) {
    		this.low15 = low15;
    	}
    	
    	public String getClose15() {
    		return close15;
    	}
    	
    	public void setClose15(String close15) {
    		this.close15 = close15;
    	}
    	
    	public String getVolume15() {
    		return volume15;
    	}
    	
    	public void setVolume15(String volume15) {
    		this.volume15 = volume15;
    	}
    	
    	public String getAdjclose15() {
    		return adjclose15;
    	}
    	
    	public void setAdjclose15(String adjclose15) {
    		this.adjclose15 = adjclose15;
    	}    	
    	
    	public PRU() {
    	}
    }
    
    public class PSN {
    	
    	private String date16;
    	
    	private String open16;
    	
    	private String high16;
    	
    	private String low16;
    	
    	private String close16;
    	
    	private String volume16;
    	
    	private String adjclose16;
    		
    	public String getDate16() {
    		return date16;
    	}
    	
    	public void setDate16(String date16) {
    		this.date16 = date16;
    	}
    	
    	public String getOpen16() {
    		return open16;
    	}
    	
    	public void setOpen16(String open16) {
    		this.open16 = open16;
    	}    	    	
    	
    	public String getHigh16() {
    		return high16;
    	}
    	
    	public void setHigh16(String high16) {
    		this.high16 = high16;
    	}
    	
    	public String getLow16() {
    		return low16;
    	}
    	
    	public void setLow16(String low16) {
    		this.low16 = low16;
    	}
    	
    	public String getClose16() {
    		return close16;
    	}
    	
    	public void setClose16(String close16) {
    		this.close16 = close16;
    	}
    	
    	public String getVolume16() {
    		return volume16;
    	}
    	
    	public void setVolume16(String volume16) {
    		this.volume16 = volume16;
    	}	
    	
    	public String getAdjclose16() {
    		return adjclose16;
    	}
    	
    	public void setAdjclose16(String adjclose16) {
    		this.adjclose16 = adjclose16;
    	}    	
    	
    	public PSN() {
    	}
    }
    
    public class RB {
    	
    	private String date17;
    	
    	private String open17;
    	
    	private String high17;
    	
    	private String low17;
    	
    	private String close17;
    	
    	private String volume17;
    	
    	private String adjclose17;
    		
    	public String getDate17() {
    		return date17;
    	}
    	
    	public void setDate17(String date17) {
    		this.date17 = date17;
    	}
    	
    	public String getOpen17() {
    		return open17;
    	}
    	
    	public void setOpen17(String open17) {
    		this.open17 = open17;
    	}    	    	
    	
    	public String getHigh17() {
    		return high17;
    	}
    	
    	public void setHigh17(String high17) {
    		this.high17 = high17;
    	}
    	
    	public String getLow17() {
    		return low17;
    	}
    	
    	public void setLow17(String low17) {
    		this.low17 = low17;
    	}
    	
    	public String getClose17() {
    		return close17;
    	}
    	
    	public void setClose17(String close17) {
    		this.close17 = close17;
    	}
    	
    	public String getVolume17() {
    		return volume17;
    	}
    	
    	public void setVolume17(String volume17) {
    		this.volume17 = volume17;
    	}
    	
    	public String getAdjclose17() {
    		return adjclose17;
    	}
    	
    	public void setAdjclose17(String adjclose17) {
    		this.adjclose17 = adjclose17;
    	}    	
    	
    	public RB() {
    	}
    }
    
    public class RDSA {
    	
    	private String date18;
    	
    	private String open18;
    	
    	private String high18;
    	
    	private String low18;
    	
    	private String close18;
    	
    	private String volume18;
    	
    	private String adjclose18;
    		
    	public String getDate18() {
    		return date18;
    	}
    	
    	public void setDate18(String date18) {
    		this.date18 = date18;
    	}
    	
    	public String getOpen18() {
    		return open18;
    	}
    	
    	public void setOpen18(String open18) {
    		this.open18 = open18;
    	}    	    	
    	
    	public String getHigh18() {
    		return high18;
    	}
    	
    	public void setHigh18(String high18) {
    		this.high18 = high18;
    	}
    	
    	public String getLow18() {
    		return low18;
    	}
    	
    	public void setLow18(String low18) {
    		this.low18 = low18;
    	}
    	
    	public String getClose18() {
    		return close18;
    	}
    	
    	public void setClose18(String close18) {
    		this.close18 = close18;
    	}
    	
    	public String getVolume18() {
    		return volume18;
    	}
    	
    	public void setVolume18(String volume18) {
    		this.volume18 = volume18;
    	}
    	
    	public String getAdjclose18() {
    		return adjclose18;
    	}
    	
    	public void setAdjclose18(String adjclose18) {
    		this.adjclose18 = adjclose18;
    	}    	
    	
    	public RDSA() {
    	}
    }
    
    public class RR {
    	
    	private String date19;
    	
    	private String open19;
    	
    	private String high19;
    	
    	private String low19;
    	
    	private String close19;
    	
    	private String volume19;
    	
    	private String adjclose19;
    		
    	public String getDate19() {
    		return date19;
    	}
    	
    	public void setDate19(String date19) {
    		this.date19 = date19;
    	}
    	
    	public String getOpen19() {
    		return open19;
    	}
    	
    	public void setOpen19(String open19) {
    		this.open19 = open19;
    	}    	    	
    	
    	public String getHigh19() {
    		return high19;
    	}
    	
    	public void setHigh19(String high19) {
    		this.high19 = high19;
    	}
    	
    	public String getLow19() {
    		return low19;
    	}
    	
    	public void setLow19(String low19) {
    		this.low19 = low19;
    	}
    	
    	public String getClose19() {
    		return close19;
    	}
    	
    	public void setClose19(String close19) {
    		this.close19 = close19;
    	}
    	
    	public String getVolume19() {
    		return volume19;
    	}
    	
    	public void setVolume19(String volume19) {
    		this.volume19 = volume19;
    	}
    	
    	public String getAdjclose19() {
    		return adjclose19;
    	}
    	
    	public void setAdjclose19(String adjclose19) {
    		this.adjclose19 = adjclose19;
    	}    	
    	
    	public RR() {
    	}
    }
    
    public class SDR {
    	
    	private String date20;
    	
    	private String open20;
    	
    	private String high20;
    	
    	private String low20;
    	
    	private String close20;
    	
    	private String volume20;
    	
    	private String adjclose20;
    		
    	public String getDate20() {
    		return date20;
    	}
    	
    	public void setDate20(String date20) {
    		this.date20 = date20;
    	}
    	
    	public String getOpen20() {
    		return open20;
    	}
    	
    	public void setOpen20(String open20) {
    		this.open20 = open20;
    	}    	    	
    	
    	public String getHigh20() {
    		return high20;
    	}
    	
    	public void setHigh20(String high20) {
    		this.high20 = high20;
    	}
    	
    	public String getLow20() {
    		return low20;
    	}
    	
    	public void setLow20(String low20) {
    		this.low20 = low20;
    	}
    	
    	public String getClose20() {
    		return close20;
    	}
    	
    	public void setClose20(String close20) {
    		this.close20 = close20;
    	}
    	
    	public String getVolume20() {
    		return volume20;
    	}
    	
    	public void setVolume20(String volume20) {
    		this.volume20 = volume20;
    	}
    	
    	public String getAdjclose20() {
    		return adjclose20;
    	}
    	
    	public void setAdjclose20(String adjclose20) {
    		this.adjclose20 = adjclose20;
    	}    	
    	
    	public SDR() {
    	}
    }
    
    public class SHP {
    	
    	private String date21;
    	
    	private String open21;
    	
    	private String high21;
    	
    	private String low21;
    	
    	private String close21;
    	
    	private String volume21;
    	
    	private String adjclose21;
    		
    	public String getDate21() {
    		return date21;
    	}
    	
    	public void setDate21(String date21) {
    		this.date21 = date21;
    	}
    	
    	public String getOpen21() {
    		return open21;
    	}
    	
    	public void setOpen21(String open21) {
    		this.open21 = open21;
    	}    	    	
    	
    	public String getHigh21() {
    		return high21;
    	}
    	
    	public void setHigh21(String high21) {
    		this.high21 = high21;
    	}
    	
    	public String getLow21() {
    		return low21;
    	}
    	
    	public void setLow21(String low21) {
    		this.low21 = low21;
    	}
    	
    	public String getClose21() {
    		return close21;
    	}
    	
    	public void setClose21(String close21) {
    		this.close21 = close21;
    	}
    	
    	public String getVolume21() {
    		return volume21;
    	}
    	
    	public void setVolume21(String volume21) {
    		this.volume21 = volume21;
    	}
    	
    	public String getAdjclose21() {
    		return adjclose21;
    	}
    	
    	public void setAdjclose21(String adjclose21) {
    		this.adjclose21 = adjclose21;
    	}    	
    	
    	public SHP() {
    	}
    }
    
    public class SKY {
    	
    	private String date22;
    	
    	private String open22;
    	
    	private String high22;
    	
    	private String low22;
    	
    	private String close22;
    	
    	private String volume22;
    	
    	private String adjclose22;
    		
    	public String getDate22() {
    		return date22;
    	}
    	
    	public void setDate22(String date22) {
    		this.date22 = date22;
    	}
    	
    	public String getOpen22() {
    		return open22;
    	}
    	
    	public void setOpen22(String open22) {
    		this.open22 = open22;
    	}    	    	
    	
    	public String getHigh22() {
    		return high22;
    	}
    	
    	public void setHigh22(String high22) {
    		this.high22 = high22;
    	}
    	
    	public String getLow22() {
    		return low22;
    	}
    	
    	public void setLow22(String low22) {
    		this.low22 = low22;
    	}
    	
    	public String getClose22() {
    		return close22;
    	}
    	
    	public void setClose22(String close22) {
    		this.close22 = close22;
    	}
    	
    	public String getVolume22() {
    		return volume22;
    	}
    	
    	public void setVolume22(String volume22) {
    		this.volume22 = volume22;
    	}
    	
    	public String getAdjclose22() {
    		return adjclose22;
    	}
    	
    	public void setAdjclose22(String adjclose22) {
    		this.adjclose22 = adjclose22;
    	}    	
    	
    	public SKY() {
    	}
    }
    
    public class SSE {
    	
    	private String date23;
    	
    	private String open23;
    	
    	private String high23;
    	
    	private String low23;
    	
    	private String close23;
    	
    	private String volume23;
    	
    	private String adjclose23;
    		
    	public String getDate23() {
    		return date23;
    	}
    	
    	public void setDate23(String date23) {
    		this.date23 = date23;
    	}
    	
    	public String getOpen23() {
    		return open23;
    	}
    	
    	public void setOpen23(String open23) {
    		this.open23 = open23;
    	}    	    	
    	
    	public String getHigh23() {
    		return high23;
    	}
    	
    	public void setHigh23(String high23) {
    		this.high23 = high23;
    	}
    	
    	public String getLow23() {
    		return low23;
    	}
    	
    	public void setLow23(String low23) {
    		this.low23 = low23;
    	}
    	
    	public String getClose23() {
    		return close23;
    	}
    	
    	public void setClose23(String close23) {
    		this.close23 = close23;
    	}
    	
    	public String getVolume23() {
    		return volume23;
    	}
    	
    	public void setVolume23(String volume23) {
    		this.volume23 = volume23;
    	}
    	
    	public String getAdjclose23() {
    		return adjclose23;
    	}
    	
    	public void setAdjclose23(String adjclose23) {
    		this.adjclose23 = adjclose23;
    	}    	
    	
    	public SSE() {
    	}
    }
    
    public class STJ {
    	
    	private String date24;
    	
    	private String open24;
    	
    	private String high24;
    	
    	private String low24;
    	
    	private String close24;
    	
    	private String volume24;
    	
    	private String adjclose24;
    		
    	public String getDate24() {
    		return date24;
    	}
    	
    	public void setDate24(String date24) {
    		this.date24 = date24;
    	}
    	
    	public String getOpen24() {
    		return open24;
    	}
    	
    	public void setOpen24(String open24) {
    		this.open24 = open24;
    	}    	    	
    	
    	public String getHigh24() {
    		return high24;
    	}
    	
    	public void setHigh24(String high24) {
    		this.high24 = high24;
    	}
    	
    	public String getLow24() {
    		return low24;
    	}
    	
    	public void setLow24(String low24) {
    		this.low24 = low24;
    	}
    	
    	public String getClose24() {
    		return close24;
    	}
    	
    	public void setClose24(String close24) {
    		this.close24 = close24;
    	}
    	
    	public String getVolume24() {
    		return volume24;
    	}
    	
    	public void setVolume24(String volume24) {
    		this.volume24 = volume24;
    	}
    	
    	public String getAdjclose24() {
    		return adjclose24;
    	}
    	
    	public void setAdjclose24(String adjclose24) {
    		this.adjclose24 = adjclose24;
    	}    	
    	
    	public STJ() {
    	}
    }
    
    public class TSCO {
    	
    	private String date25;
    	
    	private String open25;
    	
    	private String high25;
    	
    	private String low25;
    	
    	private String close25;
    	
    	private String volume25;
    	
    	private String adjclose25;
    		
    	public String getDate25() {
    		return date25;
    	}
    	
    	public void setDate25(String date25) {
    		this.date25 = date25;
    	}
    	
    	public String getOpen25() {
    		return open25;
    	}
    	
    	public void setOpen25(String open25) {
    		this.open25 = open25;
    	}    	    	
    	
    	public String getHigh25() {
    		return high25;
    	}
    	
    	public void setHigh25(String high25) {
    		this.high25 = high25;
    	}
    	
    	public String getLow25() {
    		return low25;
    	}
    	
    	public void setLow25(String low25) {
    		this.low25 = low25;
    	}
    	
    	public String getClose25() {
    		return close25;
    	}
    	
    	public void setClose25(String close25) {
    		this.close25 = close25;
    	}
    	
    	public String getVolume25() {
    		return volume25;
    	}
    	
    	public void setVolume25(String volume25) {
    		this.volume25 = volume25;
    	}
    	
    	public String getAdjclose25() {
    		return adjclose25;
    	}
    	
    	public void setAdjclose25(String adjclose25) {
    		this.adjclose25 = adjclose25;
    	}    	
    	
    	public TSCO() {
    	}
    }
    
    public class TUI {
    	
    	private String date26;
    	
    	private String open26;
    	
    	private String high26;
    	
    	private String low26;
    	
    	private String close26;
    	
    	private String volume26;
    	
    	private String adjclose26;
    		
    	public String getDate26() {
    		return date26;
    	}
    	
    	public void setDate26(String date26) {
    		this.date26 = date26;
    	}
    	
    	public String getOpen26() {
    		return open26;
    	}
    	
    	public void setOpen26(String open26) {
    		this.open26 = open26;
    	}    	    	
    	
    	public String getHigh26() {
    		return high26;
    	}
    	
    	public void setHigh26(String high26) {
    		this.high26 = high26;
    	}
    	
    	public String getLow26() {
    		return low26;
    	}
    	
    	public void setLow26(String low26) {
    		this.low26 = low26;
    	}
    	
    	public String getClose26() {
    		return close26;
    	}
    	
    	public void setClose26(String close26) {
    		this.close26 = close26;
    	}
    	
    	public String getVolume26() {
    		return volume26;
    	}
    	
    	public void setVolume26(String volume26) {
    		this.volume26 = volume26;
    	}
    	
    	public String getAdjclose26() {
    		return adjclose26;
    	}
    	
    	public void setAdjclose26(String adjclose26) {
    		this.adjclose26 = adjclose26;
    	}    	
    	
    	public TUI() {
    	}
    }
    
    public class VOD {
    	
    	private String date27;
    	
    	private String open27;
    	
    	private String high27;
    	
    	private String low27;
    	
    	private String close27;
    	
    	private String volume27;
    	
    	private String adjclose27;
    		
    	public String getDate27() {
    		return date27;
    	}
    	
    	public void setDate27(String date27) {
    		this.date27 = date27;
    	}
    	
    	public String getOpen27() {
    		return open27;
    	}
    	
    	public void setOpen27(String open27) {
    		this.open27 = open27;
    	}    	    	
    	
    	public String getHigh27() {
    		return high27;
    	}
    	
    	public void setHigh27(String high27) {
    		this.high27 = high27;
    	}
    	
    	public String getLow27() {
    		return low27;
    	}
    	
    	public void setLow27(String low27) {
    		this.low27 = low27;
    	}
    	
    	public String getClose27() {
    		return close27;
    	}
    	
    	public void setClose27(String close27) {
    		this.close27 = close27;
    	}
    	
    	public String getVolume27() {
    		return volume27;
    	}
    	
    	public void setVolume27(String volume27) {
    		this.volume27 = volume27;
    	}
    	
    	public String getAdjclose27() {
    		return adjclose27;
    	}
    	
    	public void setAdjclose27(String adjclose27) {
    		this.adjclose27 = adjclose27;
    	}    	
    	
    	public VOD() {
    	}
    }
    
    public class WPG {
    	
    	private String date28;
    	
    	private String open28;
    	
    	private String high28;
    	
    	private String low28;
    	
    	private String close28;
    	
    	private String volume28;
    	
    	private String adjclose28;
    		
    	public String getDate28() {
    		return date28;
    	}
    	
    	public void setDate28(String date28) {
    		this.date28 = date28;
    	}
    	
    	public String getOpen28() {
    		return open28;
    	}
    	
    	public void setOpen28(String open28) {
    		this.open28 = open28;
    	}    	    	
    	
    	public String getHigh28() {
    		return high28;
    	}
    	
    	public void setHigh28(String high28) {
    		this.high28 = high28;
    	}
    	
    	public String getLow28() {
    		return low28;
    	}
    	
    	public void setLow28(String low28) {
    		this.low28 = low28;
    	}
    	
    	public String getClose28() {
    		return close28;
    	}
    	
    	public void setClose28(String close28) {
    		this.close28 = close28;
    	}
    	
    	public String getVolume28() {
    		return volume28;
    	}
    	
    	public void setVolume28(String volume28) {
    		this.volume28 = volume28;
    	}
    	
    	public String getAdjclose28() {
    		return adjclose28;
    	}
    	
    	public void setAdjclose28(String adjclose28) {
    		this.adjclose28 = adjclose28;
    	}    	
    	
    	public WPG() {
    	}
    }
}