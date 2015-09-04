/*
 * Page1.java
 *
 * Created on Jun 24, 2013, 3:39:01 PM
 */
 
package esrixstringlocalization;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Alert;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Checkbox;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Head;
import com.sun.webui.jsf.component.Html;
import com.sun.webui.jsf.component.Hyperlink;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.Link;
import com.sun.webui.jsf.component.MessageGroup;
import com.sun.webui.jsf.component.Page;
import com.sun.webui.jsf.component.StaticText;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.Upload;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import com.sun.webui.jsf.model.UploadedFile;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.FacesException;
import javax.faces.component.UIComponent;
import javax.faces.component.html.HtmlOutputText;
import javax.faces.component.html.HtmlSelectBooleanCheckbox;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.servlet.ServletContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import java.io.InputStreamReader;
import java.util.Vector;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 *
 * @author trisoft-admin
 */
public class Page1 extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }

    private Page page1 = new Page();
    
    public Page getPage1() {
        return page1;
    }
    
    public void setPage1(Page p) {
        this.page1 = p;
    }
    
    private Html html1 = new Html();
    
    public Html getHtml1() {
        return html1;
    }
    
    public void setHtml1(Html h) {
        this.html1 = h;
    }
    
    private Head head1 = new Head();
    
    public Head getHead1() {
        return head1;
    }
    
    public void setHead1(Head h) {
        this.head1 = h;
    }
    
    private Link link1 = new Link();
    
    public Link getLink1() {
        return link1;
    }
    
    public void setLink1(Link l) {
        this.link1 = l;
    }
    
    private Body body1 = new Body();
    
    public Body getBody1() {
        return body1;
    }
    
    public void setBody1(Body b) {
        this.body1 = b;
    }
    
    private Form form1 = new Form();
    
    public Form getForm1() {
        return form1;
    }
    
    public void setForm1(Form f) {
        this.form1 = f;
    }
    private Label label1 = new Label();

    public Label getLabel1() {
        return label1;
    }

    public void setLabel1(Label l) {
        this.label1 = l;
    }
    private Label label2 = new Label();

    public Label getLabel2() {
        return label2;
    }

    public void setLabel2(Label l) {
        this.label2 = l;
    }
    private Label label3 = new Label();

    public Label getLabel3() {
        return label3;
    }

    public void setLabel3(Label l) {
        this.label3 = l;
    }
    private Upload fileUpload1 = new Upload();

    public Upload getFileUpload1() {
        return fileUpload1;
    }

    public void setFileUpload1(Upload u) {
        this.fileUpload1 = u;
    }
    private Label label5 = new Label();

    public Label getLabel5() {
        return label5;
    }

    public void setLabel5(Label l) {
        this.label5 = l;
    }
    private Label label6 = new Label();

    public Label getLabel6() {
        return label6;
    }

    public void setLabel6(Label l) {
        this.label6 = l;
    }
    private Checkbox checkbox_ar = new Checkbox();

    public Checkbox getCheckbox_ar() {
        return checkbox_ar;
    }

    public void setCheckbox_ar(Checkbox c) {
        this.checkbox_ar = c;
    }
    private Checkbox checkbox_es = new Checkbox();

    public Checkbox getCheckbox_es() {
        return checkbox_es;
    }

    public void setCheckbox_es(Checkbox c) {
        this.checkbox_es = c;
    }
    private Checkbox checkbox_de = new Checkbox();

    public Checkbox getCheckbox_de() {
        return checkbox_de;
    }

    public void setCheckbox_de(Checkbox c) {
        this.checkbox_de = c;
    }
    private Checkbox checkbox_fr = new Checkbox();

    public Checkbox getCheckbox_fr() {
        return checkbox_fr;
    }

    public void setCheckbox_fr(Checkbox c) {
        this.checkbox_fr = c;
    }
    private Checkbox checkbox_it = new Checkbox();

    public Checkbox getCheckbox_it() {
        return checkbox_it;
    }

    public void setCheckbox_it(Checkbox c) {
        this.checkbox_it = c;
    }
    private Checkbox checkbox_ja = new Checkbox();

    public Checkbox getCheckbox_ja() {
        return checkbox_ja;
    }

    public void setCheckbox_ja(Checkbox c) {
        this.checkbox_ja = c;
    }
    private Checkbox checkbox_ptBR = new Checkbox();

    public Checkbox getCheckbox_ptBR() {
        return checkbox_ptBR;
    }

    public void setCheckbox_ptBR(Checkbox c) {
        this.checkbox_ptBR = c;
    }
    private Checkbox checkbox_ru = new Checkbox();

    public Checkbox getCheckbox_ru() {
        return checkbox_ru;
    }

    public void setCheckbox_ru(Checkbox c) {
        this.checkbox_ru = c;
    }
    private Checkbox checkbox_zhcn = new Checkbox();

    public Checkbox getCheckbox_zhcn() {
        return checkbox_zhcn;
    }

    public void setCheckbox_zhcn(Checkbox c) {
        this.checkbox_zhcn = c;
    }
    private Checkbox checkbox_enGB = new Checkbox();

    public Checkbox getCheckbox_enGB() {
        return checkbox_enGB;
    }

    public void setCheckbox_enGB(Checkbox c) {
        this.checkbox_enGB = c;
    }
    private Button checkAll_button = new Button();

    public Button getCheckAll_button() {
        return checkAll_button;
    }

    public void setCheckAll_button(Button b) {
        this.checkAll_button = b;
    }
    private Button unchekAll_button = new Button();

    public Button getUnchekAll_button() {
        return unchekAll_button;
    }

    public void setUnchekAll_button(Button b) {
        this.unchekAll_button = b;
    }
    private Label label7 = new Label();

    public Label getLabel7() {
        return label7;
    }

    public void setLabel7(Label l) {
        this.label7 = l;
    }
    private Button submit_Button = new Button();

    public Button getSubmit_Button() {
        return submit_Button;
    }

    public void setSubmit_Button(Button b) {
        this.submit_Button = b;
    }

    // </editor-fold>
public static String userDir = System.getProperty("user.dir");      
public static int FOLDER_ID;
public static String ID;
public static String PROJECT_ROOT_FOLDER;
public static String PARSER_STRING;
public static String SELECTED_LANGUAGES;
public static String ADD_RESOURCES;
public static String UPDATE_STRING;
public static String COMMAND_LINE ="pslcmd.exe /newproject:";
public static String WIN32_OPTION_STRING;
public static String WIN64_OPTION_STRING;
public static String WIN32_EXE_OPTION_STRING;
public static String WIN64_EXE_OPTION_STRING;
private static StringBuilder stringBuff = new StringBuilder();
private static StringBuilder errorstringBuff = new StringBuilder();
public static boolean UPDATE_FOLDERID;
public static boolean ErrFileTypeFlag;
public static boolean FileTypeFlag;
public static boolean AddLogFileFlag;
public static String fileType = "";
    private Button button_Cancel = new Button();

    public Button getButton_Cancel() {
        return button_Cancel;
    }

    public void setButton_Cancel(Button b) {
        this.button_Cancel = b;
    }
    private Hyperlink hyperlink1 = new Hyperlink();
    
    public Hyperlink getHyperlink1() {
        return hyperlink1;
    }

    public void setHyperlink1(Hyperlink h) {
        this.hyperlink1 = h;
    }
    private TextArea textArea1 = new TextArea();

    public TextArea getTextArea1() {
        return textArea1;
    }

    public void setTextArea1(TextArea ta) {
        this.textArea1 = ta;
    }
    private Button button_Start = new Button();

    public Button getButton_Start() {
        return button_Start;
    }

    public void setButton_Start(Button b) {
        this.button_Start = b;
    }
    private Checkbox checkbox_tr = new Checkbox();

    public Checkbox getCheckbox_tr() {
        return checkbox_tr;
    }

    public void setCheckbox_tr(Checkbox c) {
        this.checkbox_tr = c;
    }
    private Checkbox checkbox_fi = new Checkbox();

    public Checkbox getCheckbox_fi() {
        return checkbox_fi;
    }

    public void setCheckbox_fi(Checkbox c) {
        this.checkbox_fi = c;
    }
    private Checkbox checkbox_cs = new Checkbox();

    public Checkbox getCheckbox_cs() {
        return checkbox_cs;
    }

    public void setCheckbox_cs(Checkbox c) {
        this.checkbox_cs = c;
    }
    private Checkbox checkbox_he = new Checkbox();

    public Checkbox getCheckbox_he() {
        return checkbox_he;
    }

    public void setCheckbox_he(Checkbox c) {
        this.checkbox_he = c;
    }
    private Checkbox checkbox_ko = new Checkbox();

    public Checkbox getCheckbox_ko() {
        return checkbox_ko;
    }

    public void setCheckbox_ko(Checkbox c) {
        this.checkbox_ko = c;
    }
    private StaticText errorText = new StaticText();

    public StaticText getErrorText() {
        return errorText;
    }

    public void setErrorText(StaticText st) {
        this.errorText = st;
    }
    private MessageGroup messageGroup1 = new MessageGroup();

    public MessageGroup getMessageGroup1() {
        return messageGroup1;
    }

    public void setMessageGroup1(MessageGroup mg) {
        this.messageGroup1 = mg;
    }
    private Alert alert1 = new Alert();

    public Alert getAlert1() {
        return alert1;
    }

    public void setAlert1(Alert a) {
        this.alert1 = a;
    }
    private Alert alert2 = new Alert();

    public Alert getAlert2() {
        return alert2;
    }

    public void setAlert2(Alert a) {
        this.alert2 = a;
    }
    private Checkbox checkbox_da = new Checkbox();

    public Checkbox getCheckbox_da() {
        return checkbox_da;
    }

    public void setCheckbox_da(Checkbox c) {
        this.checkbox_da = c;
    }
    private Checkbox checkbox_el = new Checkbox();

    public Checkbox getCheckbox_el() {
        return checkbox_el;
    }

    public void setCheckbox_el(Checkbox c) {
        this.checkbox_el = c;
    }
    private Checkbox checkbox_et = new Checkbox();

    public Checkbox getCheckbox_et() {
        return checkbox_et;
    }

    public void setCheckbox_et(Checkbox c) {
        this.checkbox_et = c;
    }
    private Checkbox checkbox_lt = new Checkbox();

    public Checkbox getCheckbox_lt() {
        return checkbox_lt;
    }

    public void setCheckbox_lt(Checkbox c) {
        this.checkbox_lt = c;
    }
    private Checkbox checkbox_lv = new Checkbox();

    public Checkbox getCheckbox_lv() {
        return checkbox_lv;
    }

    public void setCheckbox_lv(Checkbox c) {
        this.checkbox_lv = c;
    }
    private Checkbox checkbox_no = new Checkbox();

    public Checkbox getCheckbox_no() {
        return checkbox_no;
    }

    public void setCheckbox_no(Checkbox c) {
        this.checkbox_no = c;
    }
    private Checkbox checkbox_nl = new Checkbox();

    public Checkbox getCheckbox_nl() {
        return checkbox_nl;
    }

    public void setCheckbox_nl(Checkbox c) {
        this.checkbox_nl = c;
    }
    private Checkbox checkbox_pl = new Checkbox();

    public Checkbox getCheckbox_pl() {
        return checkbox_pl;
    }

    public void setCheckbox_pl(Checkbox c) {
        this.checkbox_pl = c;
    }
    private Checkbox checkbox_ptPT = new Checkbox();

    public Checkbox getCheckbox_ptPT() {
        return checkbox_ptPT;
    }

    public void setCheckbox_ptPT(Checkbox c) {
        this.checkbox_ptPT = c;
    }
    private Checkbox checkbox_ro = new Checkbox();

    public Checkbox getCheckbox_ro() {
        return checkbox_ro;
    }

    public void setCheckbox_ro(Checkbox c) {
        this.checkbox_ro = c;
    }
    private Checkbox checkbox_sv = new Checkbox();

    public Checkbox getCheckbox_sv() {
        return checkbox_sv;
    }

    public void setCheckbox_sv(Checkbox c) {
        this.checkbox_sv = c;
    }
    private Checkbox checkbox_th = new Checkbox();

    public Checkbox getCheckbox_th() {
        return checkbox_th;
    }

    public void setCheckbox_th(Checkbox c) {
        this.checkbox_th = c;
    }
    private Checkbox checkbox_vi = new Checkbox();

    public Checkbox getCheckbox_vi() {
        return checkbox_vi;
    }

    public void setCheckbox_vi(Checkbox c) {
        this.checkbox_vi = c;
    }
    private Checkbox checkbox_zhtw = new Checkbox();

    public Checkbox getCheckbox_zhtw() {
        return checkbox_zhtw;
    }

    public void setCheckbox_zhtw(Checkbox c) {
        this.checkbox_zhtw = c;
    }
    private Label label4 = new Label();

    public Label getLabel4() {
        return label4;
    }

    public void setLabel4(Label l) {
        this.label4 = l;
    }
    private Label label8 = new Label();

    public Label getLabel8() {
        return label8;
    }

    public void setLabel8(Label l) {
        this.label8 = l;
    }
    private Label label9 = new Label();

    public Label getLabel9() {
        return label9;
    }

    public void setLabel9(Label l) {
        this.label9 = l;
    }
    private Label label10 = new Label();

    public Label getLabel10() {
        return label10;
    }

    public void setLabel10(Label l) {
        this.label10 = l;
    }
    
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public Page1() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    
    private String realFilePath;
    private static final String FILE_URL = "resources/upload";
    
    public static String fileUpload1_path = null;
    
    @Override
    public void init() {
        alert1.setVisible(false);
        alert2.setVisible(false);
        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here
        
        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("Page1 Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e: new FacesException(e);
        }
        
        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        
         ServletContext theApplicationsServletContext = 

        (ServletContext) this.getExternalContext().getContext();

        this.realFilePath = theApplicationsServletContext.getRealPath(FILE_URL);
        
        try {  
            readProperties("passolo");
            
        } catch(Exception e)
            {
                e.printStackTrace();
            }
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
    }
    
    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Return a reference to the scoped data bean.</p>
     *
     * @return reference to the scoped data bean
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    public String checkAll_button_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
                boolean isSelected = true;
        if (isSelected)
        {    
            checkbox_enGB.setSelected(true);
            checkbox_ar.setSelected(true);
            checkbox_cs.setSelected(true);
            checkbox_da.setSelected(true);
            checkbox_de.setSelected(true);
            checkbox_el.setSelected(true);
            checkbox_es.setSelected(true);
            checkbox_et.setSelected(true);
            checkbox_fi.setSelected(true);
            checkbox_fr.setSelected(true);
            checkbox_he.setSelected(true);
            checkbox_it.setSelected(true);
            checkbox_ja.setSelected(true);
            checkbox_ko.setSelected(true);
            checkbox_lt.setSelected(true);
            checkbox_lv.setSelected(true);
            checkbox_no.setSelected(true);
            checkbox_nl.setSelected(true);
            checkbox_pl.setSelected(true);
            checkbox_ptBR.setSelected(true);
            checkbox_ptPT.setSelected(true);
            checkbox_ro.setSelected(true);
            checkbox_ru.setSelected(true);
            checkbox_sv.setSelected(true);
            checkbox_th.setSelected(true);
            checkbox_tr.setSelected(true);
            checkbox_vi.setSelected(true);
            checkbox_zhcn.setSelected(true);
            checkbox_zhtw.setSelected(true);
           
        } 
        return null;
    }

    public String unchekcall_button_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        boolean isUnchecked = true;
        if (isUnchecked)
        {
            checkbox_enGB.setSelected(false);
            checkbox_ar.setSelected(false);
            checkbox_cs.setSelected(false);
            checkbox_da.setSelected(false);
            checkbox_de.setSelected(false);
            checkbox_el.setSelected(false);
            checkbox_es.setSelected(false);
            checkbox_et.setSelected(false);
            checkbox_fi.setSelected(false);
            checkbox_fr.setSelected(false);
            checkbox_he.setSelected(false);
            checkbox_it.setSelected(false);
            checkbox_ja.setSelected(false);
            checkbox_ko.setSelected(false);
            checkbox_lt.setSelected(false);
            checkbox_lv.setSelected(false);
            checkbox_no.setSelected(false);
            checkbox_nl.setSelected(false);
            checkbox_pl.setSelected(false);
            checkbox_ptBR.setSelected(false);
            checkbox_ptPT.setSelected(false);
            checkbox_ro.setSelected(false);
            checkbox_ru.setSelected(false);
            checkbox_sv.setSelected(false);
            checkbox_th.setSelected(false);
            checkbox_tr.setSelected(false);
            checkbox_vi.setSelected(false);
            checkbox_zhcn.setSelected(false);
            checkbox_zhtw.setSelected(false);
        }  
        return null;
    }

    public String submit_Button_action() throws InterruptedException {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        
      if ((!checkbox_enGB.isChecked()) && (!checkbox_ar.isChecked()) && 
          (!checkbox_cs.isChecked()) && (!checkbox_da.isChecked()) && 
          (!checkbox_de.isChecked()) && (!checkbox_el.isChecked()) && 
          (!checkbox_et.isChecked()) && (!checkbox_fi.isChecked()) && 
          (!checkbox_fr.isChecked()) && (!checkbox_he.isChecked()) && 
          (!checkbox_it.isChecked()) && (!checkbox_ja.isChecked()) && 
          (!checkbox_ko.isChecked()) && (!checkbox_lt.isChecked()) && 
          (!checkbox_lv.isChecked()) && (!checkbox_no.isChecked()) && 
          (!checkbox_nl.isChecked()) && (!checkbox_pl.isChecked()) &&
          (!checkbox_ptBR.isChecked()) && (!checkbox_ptPT.isChecked()) &&
          (!checkbox_ro.isChecked()) && (!checkbox_ru.isChecked()) &&
          (!checkbox_sv.isChecked()) && (!checkbox_th.isChecked()) && 
          (!checkbox_tr.isChecked()) && (!checkbox_vi.isChecked()) &&
          (!checkbox_zhcn.isChecked()) && (!checkbox_zhtw.isChecked()) &&  (!checkbox_es.isChecked()))
      {
          //textArea1.setText("-------------Warning, you need to select at least one language-------------");
          //textArea1.setVisible(true);
          alert2.setDetail("Warning, you need to select at least one language");
          alert2.setVisible(true);
      }
        
      else
      {    
        while (checkPassolo())
        {
            try
            {
                TimeUnit.SECONDS.sleep(20);
            } catch (InterruptedException ex) {
                }
        } 
                    
        // GET the latest project ID
        ID = Integer.toString(FOLDER_ID);
        String JobID = ID;
        // RESET values so that old values will not be used        
        stringBuff.delete(0,  stringBuff.length());
        errorstringBuff.delete(0,  errorstringBuff.length());
        PARSER_STRING ="";
        SELECTED_LANGUAGES = "";   
        UPDATE_FOLDERID = true;
        ErrFileTypeFlag = false;
        FileTypeFlag = false;
        AddLogFileFlag = false;
        
        // Should move below 5 lines to the header session
        COMMAND_LINE = "\"C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\pslcmd.exe\" /openproject:";
        ADD_RESOURCES = "";
        WIN32_EXE_OPTION_STRING = "\"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\EmptyRsc86.dll \" load ";
        WIN64_EXE_OPTION_STRING = "\"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\EmptyRsc64.dll \" load ";
        WIN32_OPTION_STRING = "\"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Base_x86.pslopt \" load ";
        WIN64_OPTION_STRING = "\"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Base_x86.pslopt \" load "; 
        UPDATE_STRING="/update ";
        
        // Check to see which language is selected and generate the command line based on the selection.
         if (checkbox_enGB.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"en-GB\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_en.pslopt\" /translate: lang:en-GB /simulate lang:en-GB"; 
 
        } 
        
        if (checkbox_ar.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"ar\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_ar.pslopt\" /translate lang:ar /simulate lang:ar"; 
        } 
        
        if (checkbox_cs.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"cs\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_cs.pslopt\" /translate: lang:cs /simulate lang:cs"; 
 
        } 
        
        if (checkbox_da.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"da\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_da.pslopt\" /translate: lang:da /simulate lang:da"; 
 
        } 

        if (checkbox_de.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"de\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_de.pslopt\" /translate: lang:de /simulate lang:de"; 
 
        } 
        // Missing option files for Greek        
        if (checkbox_el.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"el\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_el.pslopt\" /translate: lang:el /simulate lang:el"; 
 
        } 
                
        if (checkbox_es.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"es\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_es.pslopt\" /translate lang:es /simulate lang:es";  
        }  
        
        if (checkbox_et.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"et\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_et.pslopt\" /translate: lang:et /simulate lang:et"; 
 
        } 
        
        if (checkbox_fi.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"fi\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_fi.pslopt\" /translate: lang:fi /simulate lang:fi"; 
 
        }  
                
        if (checkbox_fr.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"fr\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_fr.pslopt\" /translate lang:fr /simulate lang:fr"; 
 
        } 
        
        if (checkbox_he.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"he\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_he.pslopt\" /translate: lang:he /simulate lang:he"; 
 
        } 
        
        if (checkbox_it.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"it\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_it.pslopt\" /translate lang:it /simulate lang:it"; 
 
        } 
        
        if (checkbox_ja.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"ja\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_ja-JP.pslopt\" /translate lang:ja /simulate lang:ja"; 
 
        }
        
        if (checkbox_ko.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"ko\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_ko.pslopt\" /translate lang:ko /simulate lang:ko"; 
 
        }
        
        if (checkbox_lt.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"lt\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_lt.pslopt\" /translate lang:lt /simulate lang:lt";
 
        }
        
        if (checkbox_lv.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"lv\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_lv.pslopt\" /translate lang:lv /simulate lang:lv"; 
 
        }
        
        if (checkbox_no.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"no\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_no.pslopt\" /translate lang:no /simulate lang:no"; 
 
        }
        
        if (checkbox_nl.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"nl\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_nl.pslopt\" /translate lang:nl /simulate lang:nl"; 
 
        }
        if (checkbox_pl.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"pl\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_pl.pslopt\" /translate lang:pl /simulate lang:pl"; 
 
        } 
        if (checkbox_ptBR.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"pt-BR\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_pt-BR.pslopt\" /translate lang:pt-BR /simulate lang:pt-BR"; 
 
        }
        if (checkbox_ptPT.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"pt-PT\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_pt-BR.pslopt\" /translate lang:pt-PT /simulate lang:pt-PT"; 
 
        }
        if (checkbox_ro.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"ro\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_ro.pslopt\" /translate lang:ro /simulate lang:ro"; 
 
        } 
        if (checkbox_ru.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"ru\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_ru.pslopt\" /translate lang:ru /simulate lang:ru"; 
 
        } 
        if (checkbox_sv.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"sv\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_sv.pslopt\" /translate lang:sv /simulate lang:sv"; 
 
        }
        if (checkbox_th.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"th\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_th.pslopt\" /translate lang:th /simulate lang:th"; 
 
        }
        if (checkbox_tr.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"tr\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_tr.pslopt\" /translate: lang:tr /simulate lang:tr"; 
 
        }
        if (checkbox_vi.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"vi\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_vi.pslopt\" /translate: lang:vi /simulate lang:vi"; 
 
        } 
        if (checkbox_zhcn.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"zh-CN\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_zh-CN.pslopt\" /translate lang:zh-CN /simulate lang:zh-CN"; 
 
        }
        if (checkbox_zhtw.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"zh-TW\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files\\SDL\\SDL Passolo\\SDL Passolo 2015\\OptionFiles\\Pseudo_zh-TW.pslopt\" /translate: lang:zh-TW /simulate lang:zh-TW"; 
 
        } 
 
        UploadedFile uploadFileAll = (UploadedFile) fileUpload1.getUploadedFile();
        if (uploadFileAll == null){
            return null;
        }
        else{
            try{   
                String bb = uploadFileAll.getOriginalName(); // Full file name
                //String projectfolder = PROJECT_ROOT_FOLDER.replaceAll("/","\\");
                File folder_upload = new File(PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload");
                
                  if(!folder_upload.exists()){
                      folder_upload.mkdirs();
                 }
                
               /* File folder_download = new File(PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "download");
                if(!folder_download.exists()){
                       folder_download.mkdir();
                }*/
                File folder_script = new File(PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "batch_script");
                if(!folder_script.exists()){
                    folder_script.mkdirs();
                }
                
                if(bb.endsWith(".zip")){
                    String cc = "";
                    if(bb.contains("\\")){
                        cc = bb.substring(bb.lastIndexOf("\\"), bb.length());
                    }
                    else{
                        cc = "\\" + bb;
                    }
                    String zipFile = PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + cc;
                    File file1 = new File (zipFile);
                    uploadFileAll.write(file1);
                    ZipUtil zu = new ZipUtil();
                    String uploadFolder = PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload";
                    
                Vector<String> v = zu.readzipfile(zipFile,uploadFolder);
                for(String filePath : v){
                    String fileName = "";
                    if(filePath.contains("\\")){
                        fileName = filePath.substring(filePath.lastIndexOf("\\"),filePath.length());
                    }else{
                        fileName = "\\" + filePath;
                    }      
                    if(fileName.endsWith(".daml") || (fileName.endsWith(".DAML"))){
                        FileTypeFlag = true;
                        PARSER_STRING = "parser:AddIn:XML Parser";
                        log1("xml");
                        ADD_RESOURCES = ADD_RESOURCES + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + fileName +  " \"" + PARSER_STRING + "\" " + "targetrule:DesktopXI_XML ";
                    }
                    else if(fileName.endsWith(".exe")||(fileName.endsWith(".EXE"))){
                        FileTypeFlag = true;
                        if(distinguishWinFile(filePath)){
                            if(distinguishFile(filePath)){
                                PARSER_STRING = "Win32";
                                ADD_RESOURCES = ADD_RESOURCES + WIN32_EXE_OPTION_STRING + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + fileName +  " \"" + PARSER_STRING + "\" " + "targetrule:VC++ ";
                            }
                            else{
                                PARSER_STRING = "Win64";
                                ADD_RESOURCES = ADD_RESOURCES + WIN64_EXE_OPTION_STRING + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + fileName +  " \"" + PARSER_STRING + "\" " + "targetrule:VC++ ";
                            }
                        }
                        else{
                            PARSER_STRING = "parser:AddIn:Microsoft .NET Parser";
                            ADD_RESOURCES = ADD_RESOURCES + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" +  fileName +  " \"" + PARSER_STRING + "\" ";
                        }
                    }
                    else if(fileName.endsWith(".dll") || (fileName.endsWith(".DLL"))){
                        FileTypeFlag = true;
                        if(distinguishWinFile(filePath)){
                            if(distinguishFile(filePath)){
                                PARSER_STRING = "Win32";
                                ADD_RESOURCES = ADD_RESOURCES + WIN32_OPTION_STRING + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + fileName +  " \"" + PARSER_STRING + "\" " + "targetrule:VC++ ";
                            }else{
                                PARSER_STRING = "Win64";
                                ADD_RESOURCES = ADD_RESOURCES + WIN64_OPTION_STRING + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" +  fileName +  " \"" + PARSER_STRING + "\" " + "targetrule:VC++ ";
                            }
                        }
                        else{
                             PARSER_STRING = "parser:AddIn:Microsoft .NET Parser";
                            ADD_RESOURCES = ADD_RESOURCES + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" +  fileName +  " \"" + PARSER_STRING + "\" ";
                        }
                    }
                    else{
                           fileType = fileType + " " + fileName;
                           ErrFileTypeFlag = true;
                    }
                    File file2= new File(filePath);
                    if((file2.exists()) && (UPDATE_FOLDERID == true)){
                        try{
                            FOLDER_ID = FOLDER_ID + 1;
                            writeProperties("passolo");
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        UPDATE_FOLDERID = false;
                        }
                    }  
                }else{
                   String fileName = "";
                   if(bb.contains("\\")){
                      fileName = bb.substring(bb.lastIndexOf("\\"),bb.length());
                     }
                   else{
                       fileName = "\\" + bb;
                   } 
                   File file3 = new File(PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + fileName);
                   uploadFileAll.write(file3);
                   
                   String filePath = PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + fileName;
                    if(fileName.endsWith(".daml") || (fileName.endsWith(".DAML"))){
                        FileTypeFlag = true;
                        PARSER_STRING = "parser:AddIn:XML Parser";
                        log1("xml");
                        ADD_RESOURCES = ADD_RESOURCES + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + fileName +  " \"" + PARSER_STRING + "\" " + "targetrule:DesktopXI_XML ";
                    }
                    else if(fileName.endsWith(".exe")||(fileName.endsWith(".EXE"))){
                        FileTypeFlag = true;
                        if(distinguishWinFile(filePath)){
                            if(distinguishFile(filePath)){
                                PARSER_STRING = "Win32";
                                ADD_RESOURCES = ADD_RESOURCES + WIN32_EXE_OPTION_STRING + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + fileName +  " \"" + PARSER_STRING + "\" " + "targetrule:VC++ ";
                            }
                            else{
                                PARSER_STRING = "Win64";
                                ADD_RESOURCES = ADD_RESOURCES + WIN64_EXE_OPTION_STRING + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + fileName +  " \"" + PARSER_STRING + "\" " + "targetrule:VC++ ";
                            }
                        }
                        else{
                            PARSER_STRING = "parser:AddIn:Microsoft .NET Parser";
                            ADD_RESOURCES = ADD_RESOURCES + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" +  fileName +  " \"" + PARSER_STRING + "\" ";
                        }
                    }
                    else if(fileName.endsWith(".dll") || (fileName.endsWith(".DLL"))){
                        FileTypeFlag = true;
                        if(distinguishWinFile(filePath)){
                            if(distinguishFile(filePath)){
                                PARSER_STRING = "Win32";
                                ADD_RESOURCES = ADD_RESOURCES + WIN32_OPTION_STRING + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + fileName +  " \"" + PARSER_STRING + "\" " + "targetrule:VC++ ";
                            }else{
                                PARSER_STRING = "Win64";
                                ADD_RESOURCES = ADD_RESOURCES + WIN64_OPTION_STRING + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" +  fileName +  " \"" + PARSER_STRING + "\" " + "targetrule:VC++ ";
                            }
                        }
                        else{
                             PARSER_STRING = "parser:AddIn:Microsoft .NET Parser";
                             ADD_RESOURCES = ADD_RESOURCES + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" +  fileName +  " \"" + PARSER_STRING + "\" ";
                        }
                    }
                    else{
                           fileType = fileType + " " + fileName.substring(1, fileName.length());
                           ErrFileTypeFlag = true; 
                    }

               
                    if((file3.exists()) && (UPDATE_FOLDERID == true)){
                        try{
                            FOLDER_ID = FOLDER_ID + 1;
                            writeProperties("passolo");
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        UPDATE_FOLDERID = false;       
                    }
                }
                
                if(ErrFileTypeFlag && FileTypeFlag){
                    alert1.setDetail("Warning! The system does not support \"" + fileType + " \"file(s). " +
                            "But the system still process the supported files. ");
                    alert1.setVisible(true);
                    //errorText.setText("Warning! The system does not support " + fileType + " file(s). " +
                            //"But the system still process the supported files. ");
                    AddLogFileFlag = true;
                    File logFile = new File(PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + "\\" + "error.log");
                    if(!logFile.exists()){
                        logFile.createNewFile();
                    }
                    FileWriter fw = new FileWriter(logFile.getAbsoluteFile());
                    BufferedWriter bw = new BufferedWriter(fw);
                    bw.write("Warning! The system does not support " + fileType + " file(s). " +
                            "But the system still process the supported files. ");
                    bw.close();
                    fw.close();
                }
                else if(ErrFileTypeFlag && (!FileTypeFlag)){
                    alert1.setDetail("Error! The system does not support \"" + fileType.substring(fileType.lastIndexOf("\\")+1,fileType.length()) 
                             + "\" file(s)");
                    alert1.setVisible(true);
                     //errorText.setText("Error! The system does not support " + fileType.substring(fileType.lastIndexOf("\\")+1,fileType.length()) 
                             //+ " file(s)");
                     return null;
                }
  
            }catch (Exception e){
                 error("Cannot upload file: " + uploadFileAll.getOriginalName());
            }      
        }   
            // Copy the passolo project template to the project folder        
            File srcDir1 = new File("C:\\test\\project\\ArcGIS11_empty.lpu");
            File trgDir1 = new File(PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + "\\" + ID + ".lpu ");   
            try
            {
                FileUtils.copyFile(srcDir1, trgDir1); 
            } catch(Exception e)
            {
                e.printStackTrace();
            }
            
            //Generate passolo commands
            COMMAND_LINE = COMMAND_LINE + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + "\\" + ID + ".lpu " + SELECTED_LANGUAGES + ADD_RESOURCES + UPDATE_STRING;
            stringBuff.append(COMMAND_LINE).append(System.getProperty("line.separator"));
            
            //Create bat file for running passolo
            createReportFile(PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "batch_script", ID);
            
            //Run passlo bat file created
            
               
            generatePassolo(PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "batch_script" + "\\" + ID + ".bat", PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "batch_script" + "\\" + ID + ".log");
            Thread.sleep(1500);
            //openNewWindow();
            
            //sign the dll files
            String inFolder = PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload";
            searchDLL(inFolder);
            
            //Zip the output
            String username = System.getProperty("user.name");
            String OUTPUT_ZIP_FILE = "C:\\Documents and Settings\\"+username+"\\My Documents\\NetBeansProjects\\ESRIxStringLocalization\\build\\web\\resources\\" + ID + ".zip";
            String SOURCE_FOLDER = "C:\\test\\" + ID + "\\upload"; 
           
            try 
            {
                ZipUtil appZip = new ZipUtil();
                appZip.zipFile(SOURCE_FOLDER, OUTPUT_ZIP_FILE, true);
                if(AddLogFileFlag){
                    File file = new File(OUTPUT_ZIP_FILE);
                    File logTemp = new File(PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + "\\error.log");
                    File[] logArray = new File[1];
                    logArray[0] = logTemp;
                    appZip.addFilesToExistingZip(file, logArray);
                }
            } catch (IOException ex) 
                {
                    Logger.getLogger(ZipUtil.class.getName()).log(Level.SEVERE, null, ex);
                }            
            
            //Make the zip file available for user to download
            //Change localhost to actual server address.
            String download_url = "http://qadev00057:8080/ESRIxStringLocalization/faces/resources/" + ID + ".zip";
            hyperlink1.setUrl(download_url);
            hyperlink1.setVisible(true);
            
            if (readlogfilebyLine(PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "batch_script" + "\\" + ID + ".log") == true)
            { 
                textArea1.setText(errorstringBuff.toString());
                textArea1.setVisible(true);
            }
      } 
        
        return null;
    }

    public static boolean distinguishWinFile(String filepath) throws Exception{
		boolean winFile = false;
		String tempfile = "C:\\test\\temp.txt";
		try{    // Change the path of visual studio command prompt based on each computer
			ProcessBuilder builder = new ProcessBuilder(
					"cmd.exe","/k","\"C:\\Program Files\\Microsoft Visual Studio 10.0\\VC\\vcvarsall.bat\" && "
					+ "\"C:\\Program Files\\Microsoft Visual Studio 10.0\\VC\\bin\\dumpbin\" /headers " 
							+ filepath + " > " + tempfile);
	        builder.redirectErrorStream(true);
	        Process p = builder.start();
	        Thread.sleep(2000); 
	        BufferedReader r = new BufferedReader(new FileReader(tempfile));
	        String line = r.readLine();
	        while (line != null) {	    
	            if (line.contains("SECTION HEADER #4")){
	            	winFile = true;
	            }
	            //System.out.println(line);
	            line = r.readLine();
	        }
	        r.close();
	        File file = new File(tempfile);
	        file.delete();
		}catch(Exception e){}
		return winFile;
	}
    
	public static boolean distinguishFile(String filepath) throws Exception{
		boolean win_32 = false;
		String tempfile = "C:\\test\\temp.txt";
			try{
				ProcessBuilder builder = new ProcessBuilder(
		            "cmd.exe", "/c", "C:\\test\\is32 " + filepath + 
		            		" > " + tempfile);
		        builder.redirectErrorStream(true);
		        Process p = builder.start();
		        Thread.sleep(2000);  
		        BufferedReader r = new BufferedReader(new FileReader(tempfile));
		        String line = r.readLine();
		        while (line != null) {	    
		            if (line.contains("1")){
		            	win_32 = true;
		            }
		            line = r.readLine();
		        }
		        r.close();
		        File file = new File(tempfile);
		        file.delete();
		        
			} catch(Exception e){}
			
			return win_32;
	}    
     
    
public static boolean readlogfilebyLine(String path) 
{
    boolean error_mark = false;
    String headerline1 = "--------------------------------Error Message, Check Whether You Need To TAKE ACTION-------------------------------";
    String headerline2 = "                                                                                                                   ";
    errorstringBuff.append(headerline1).append(System.getProperty("line.separator"));  
    errorstringBuff.append(headerline2).append(System.getProperty("line.separator"));  
    try 
    {
        BufferedReader br = new BufferedReader(new FileReader(path));
        String line;
        while ((line = br.readLine()) != null) 
        {
            if ((line.indexOf("ERROR") != -1) && line.indexOf("C:\\") != -1)
            {
                error_mark = true;
                errorstringBuff.append(line).append(System.getProperty("line.separator"));            
            }
        }
        
        br.close();

    }catch (Exception e)
        {//Catch exception if any
            System.err.println("Error reading file: " + e.getMessage());
        }
    
     return error_mark;
} 
public static boolean checkPassolo()
{
    boolean mark = false;
    try 
    {
        String line;
        Process p = Runtime.getRuntime().exec("tasklist.exe /fo csv /nh");
        BufferedReader input =
                new BufferedReader(new InputStreamReader(p.getInputStream()));
        while ((line = input.readLine()) != null) 
        {
            if (line.contains("psl.exe"))
            {
                mark = true;
                //System.out.println(line); //<-- Parse data here.
            } 
        }
        input.close();
    } catch (Exception err) 
        {
            err.printStackTrace();
        }    
    return mark;
}        
public static void openNewWindow()
{
        String[] windowsCmd = new String[2];
        windowsCmd[0] = "C:\\Program Files\\Internet Explorer\\IEXPLORE.EXE";
        windowsCmd[1] = "http://localhost:8080/ESRIxStringLocalization/faces/resources/download.jsp";
        try {
           // String url = "http://www.google.com";
            //Desktop.open();
            //java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
            // Desktop.getDesktop.browse(htmlFile.toURI());
            // Desktop.getDesktop().open(htmFile);
            // Runtime.getRuntime().exec();
            // window.open("jsp name");
            
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec(windowsCmd);            
            p.waitFor();
            if (null!=p && p.waitFor() == 0 && p.exitValue()==0)
            {
                
                
            }    
        } catch (InterruptedException ex) {
            Logger.getLogger(Page1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Page1.class.getName()).log(Level.SEVERE, null, ex);
        }
}
                
public static void createReportFile(String outputfolder, String ID)
{
try 
    {  
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputfolder + "\\" + ID + "." + "bat"), "UTF-8"));
        String outText = stringBuff.toString();
        out.write(outText);
        out.close();
        System.out.println(ID + ".bat has been created successfully!");    
    } catch (IOException e)
      { 
        log1("Exception in creating script file " + e);
      } 
    }

private static void generatePassolo(String filename, String log_file_name)  
{
    String dzCmdFile = filename;
    String[] windowsCmd = new String[5];

    windowsCmd[0] = "cmd";
    windowsCmd[1] = "/c"; 
    //windowsCmd[2] = userDir + "\\" + "app.dll";
   // windowsCmd[2] = "start";
   // windowsCmd[3] = "/min";
    windowsCmd[2] = dzCmdFile; 
    windowsCmd[3] = " > ";
    windowsCmd[4] = log_file_name; 
   // String command = "cmd.exe /c " + dzCmdFile + " > " + log_file_name;
    try 
    {
        //Process p=Runtime.getRuntime().exec(windowsCmd); 
        //Process p = Runtime.getRuntime().exec(command);
        ProcessBuilder builder = new ProcessBuilder("cmd.exe","/c",dzCmdFile + " > " + log_file_name);
        builder.redirectErrorStream(true);
        Process p = builder.start();
        Thread.sleep(2000);
        if (null!=p && p.waitFor() == 0 && p.exitValue()==0)
        {  
           // String SOURCE_FOLDER = PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload";
           // String ROOT_OUTPUT_ZIP_FILE = "C:\\Documents and Settings\\trisoft-admin\\My Documents\\NetBeansProjects\\ESRIxStringLocalization\\build\\web\\resources\\";
           // String FILE_NAME = ID + ".zip";        
           // TimeUnit.SECONDS.sleep(10);  
     
          
        }
    }   catch (InterruptedException ex) {
            Logger.getLogger(Page1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
        }  
}    

public static void searchDLL(String inFolder)
{   
    String cFileName;
    String cPath;
    try 
    { 
        File folder = new File(inFolder);
        File[] listOfFiles = folder.listFiles();   
        for (int i = 0; i < listOfFiles.length; i++) 
        {                           
            if (listOfFiles[i].isFile()) 
            {                             
                cFileName = listOfFiles[i].getName();  
                String filePath = listOfFiles[i].getAbsolutePath();
		cPath = filePath.substring(0, filePath.lastIndexOf("\\"));
                String projectPath = PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload";
                if (cFileName.endsWith(".dll") || cFileName.endsWith(".DLL")) 
                {  
                    if (cPath.length() > projectPath.length())
                    {
                        signDLL(filePath);
                    }  
                }                    
            }
           
            else if (listOfFiles[i].isDirectory()) 
            {
                String currentPath = listOfFiles[i].getName();
                searchDLL(inFolder + "\\" + currentPath);
            } 
        }
    } catch (Exception e) 
        {
            e.printStackTrace();
	}  
}

private static void signDLL(String inputFilePath)  
{
    String logFileName = inputFilePath.substring(inputFilePath.lastIndexOf("\\") + 1, inputFilePath.length()) ;
    String logFilePath = inputFilePath.substring(0, inputFilePath.lastIndexOf("\\"));
    String language_code = logFilePath.substring(logFilePath.lastIndexOf("\\") + 1, logFilePath.length());
    String sign_log_filename = logFilePath.substring(0, logFilePath.lastIndexOf("\\") + 1) + logFileName + "_" + language_code + ".log";
    String[] windowsCmd = new String[8];
    windowsCmd[0] = "cmd";
    windowsCmd[1] = "/c";    
    windowsCmd[2] = "C:\\Program Files\\Microsoft.NET\\SDK\\v2.0\\Bin\\sn.exe"; 
    windowsCmd[3] = "-R";
    windowsCmd[4] = inputFilePath;
    windowsCmd[5] = "C:\\test\\snkkeys\\MappingAndCharting.snk";
    windowsCmd[6] = ">";
    windowsCmd[7] = sign_log_filename; 
 
    try 
    {
        Process p=Runtime.getRuntime().exec(windowsCmd); 
        if (null!=p && p.waitFor() == 0 && p.exitValue()==0)
        {       
           // TimeUnit.SECONDS.sleep(10);      
          
        }
    }   catch (InterruptedException ex) {
            Logger.getLogger(Page1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
        }  
}    


public static synchronized void log1(String msg) 
    {
    DataOutputStream dos = null;
    try 
    {
        String logfile = userDir + "\\log.txt";
        File file = new File(logfile);
        if(!file.exists()){
            file.createNewFile();
        }
        dos = new DataOutputStream(new FileOutputStream(logfile, true));
        dos.writeBytes(msg + System.getProperty("line.separator"));
        dos.close();
    } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }    
    
public void readProperties(String output)
{   
    FileInputStream in =null;
    Properties props = new Properties();
    try
    {
        String path = new java.io.File(".").getCanonicalPath();
        //System.out.println("ssss"+path);
        in = new FileInputStream(new File(output + "." + "properties"));
        props.load(in);
        String FOLDERID = props.getProperty("FOLDER_ID").toString();
        PROJECT_ROOT_FOLDER = props.getProperty("PROJECT_ROOT_FOLDER").toString();
        try 
        {
            FOLDER_ID = Integer.parseInt(FOLDERID.trim());
            }   catch (NumberFormatException numberFormatException) 
                {
                    numberFormatException.printStackTrace();
                }
    }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    
}


public static void writeProperties(String output)
{  
    Properties prop = new Properties();
 
    try {
            //set the properties value
            String FOLDERID = Integer.toString(FOLDER_ID);
            prop.setProperty("FOLDER_ID", FOLDERID);
            prop.setProperty("PROJECT_ROOT_FOLDER", PROJECT_ROOT_FOLDER);
            
            //save properties to project root folder
            prop.store(new FileOutputStream("passolo.properties"), null); 
            
    	} catch (IOException ex) {
    		ex.printStackTrace();
        }
}

    public void textArea1_processValueChange(ValueChangeEvent event) {
    }

    public String button_Cancel_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        boolean isCancel = true;
        if (isCancel)
        {
            checkbox_enGB.setSelected(false);
            checkbox_ar.setSelected(false);
            checkbox_cs.setSelected(false);
            checkbox_da.setSelected(false);
            checkbox_de.setSelected(false);
            checkbox_el.setSelected(false);
            checkbox_es.setSelected(false);
            checkbox_et.setSelected(false);
            checkbox_fi.setSelected(false);
            checkbox_fr.setSelected(false);
            checkbox_he.setSelected(false);
            checkbox_it.setSelected(false);
            checkbox_ja.setSelected(false);
            checkbox_ko.setSelected(false);
            checkbox_lt.setSelected(false);
            checkbox_lv.setSelected(false);
            checkbox_no.setSelected(false);
            checkbox_nl.setSelected(false);
            checkbox_pl.setSelected(false);
            checkbox_ptBR.setSelected(false);
            checkbox_ptPT.setSelected(false);
            checkbox_ro.setSelected(false);
            checkbox_ru.setSelected(false);
            checkbox_sv.setSelected(false);
            checkbox_th.setSelected(false);
            checkbox_tr.setSelected(false);
            checkbox_vi.setSelected(false);
            checkbox_zhcn.setSelected(false);
            checkbox_zhtw.setSelected(false);
            hyperlink1.setVisible(false);
            textArea1.setVisible(false);
            alert1.setVisible(false);
            alert2.setVisible(false);
            fileType = "";
        } 
        return null;
    }

    public String download_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        return null;
    }

    public void checkbox_ptBR_processValueChange(ValueChangeEvent event) {
    }

    public String button_Start_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        boolean isStart = true;
        if (isStart)
        {
            checkbox_enGB.setSelected(false);
            checkbox_ar.setSelected(false);
            checkbox_cs.setSelected(false);
            checkbox_da.setSelected(false);
            checkbox_de.setSelected(false);
            checkbox_el.setSelected(false);
            checkbox_es.setSelected(false);
            checkbox_et.setSelected(false);
            checkbox_fi.setSelected(false);
            checkbox_fr.setSelected(false);
            checkbox_he.setSelected(false);
            checkbox_it.setSelected(false);
            checkbox_ja.setSelected(false);
            checkbox_ko.setSelected(false);
            checkbox_lt.setSelected(false);
            checkbox_lv.setSelected(false);
            checkbox_no.setSelected(false);
            checkbox_nl.setSelected(false);
            checkbox_pl.setSelected(false);
            checkbox_ptBR.setSelected(false);
            checkbox_ptPT.setSelected(false);
            checkbox_ro.setSelected(false);
            checkbox_ru.setSelected(false);
            checkbox_sv.setSelected(false);
            checkbox_th.setSelected(false);
            checkbox_tr.setSelected(false);
            checkbox_vi.setSelected(false);
            checkbox_zhcn.setSelected(false);
            checkbox_zhtw.setSelected(false);
            hyperlink1.setVisible(false);
            textArea1.setVisible(false);
            alert1.setVisible(false);
            alert2.setVisible(false);
            fileType = "";
        } 
        return null;
    }

    public void checkbox_tr_validate(FacesContext fc, UIComponent uic, Object o) {
    }
    public void checkbox_ko_validate(FacesContext context, UIComponent component, Object value) {
    }



}

