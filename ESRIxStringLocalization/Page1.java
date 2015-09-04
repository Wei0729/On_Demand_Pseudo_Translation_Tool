/*
 * Page1.java
 *
 * Created on Jun 24, 2013, 3:39:01 PM
 */
 
package esrixstringlocalization;

import com.sun.rave.web.ui.appbase.AbstractPageBean;
import com.sun.webui.jsf.component.Body;
import com.sun.webui.jsf.component.Button;
import com.sun.webui.jsf.component.Checkbox;
import com.sun.webui.jsf.component.DropDown;
import com.sun.webui.jsf.component.Form;
import com.sun.webui.jsf.component.Head;
import com.sun.webui.jsf.component.Html;
import com.sun.webui.jsf.component.Label;
import com.sun.webui.jsf.component.Link;
import com.sun.webui.jsf.component.Page;
import com.sun.webui.jsf.component.TextArea;
import com.sun.webui.jsf.component.Upload;
import com.sun.webui.jsf.model.SingleSelectOptionsList;
import com.sun.webui.jsf.model.UploadedFile;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Properties;
import javax.faces.FacesException;
import javax.faces.event.ValueChangeEvent;
import javax.servlet.ServletContext;

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
        dropDown1DefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("item1", "Win32 C++"), new com.sun.webui.jsf.model.Option("item2", "Win64 C++"), new com.sun.webui.jsf.model.Option("item3", ".NET"), new com.sun.webui.jsf.model.Option("item4", "XML")});
        dropDown2DefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("item1", "Win32 C++"), new com.sun.webui.jsf.model.Option("item2", "Win64 C++"), new com.sun.webui.jsf.model.Option("item3", ".NET"), new com.sun.webui.jsf.model.Option("item4", "XML")});
        dropDown3DefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("item1", "Win32 C++"), new com.sun.webui.jsf.model.Option("item2", "Win64 C++"), new com.sun.webui.jsf.model.Option("item3", ".NET"), new com.sun.webui.jsf.model.Option("item4", "XML")});
        dropDown4DefaultOptions.setOptions(new com.sun.webui.jsf.model.Option[]{new com.sun.webui.jsf.model.Option("item1", "Win32 C++"), new com.sun.webui.jsf.model.Option("item2", "Win64 C++"), new com.sun.webui.jsf.model.Option("item3", ".NET"), new com.sun.webui.jsf.model.Option("item4", "XML")});
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
    private DropDown dropDown1 = new DropDown();

    public DropDown getDropDown1() {
        return dropDown1;
    }

    public void setDropDown1(DropDown dd) {
        this.dropDown1 = dd;
    }
    private SingleSelectOptionsList dropDown1DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown1DefaultOptions() {
        return dropDown1DefaultOptions;
    }

    public void setDropDown1DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown1DefaultOptions = ssol;
    }
    private Label label4 = new Label();

    public Label getLabel4() {
        return label4;
    }

    public void setLabel4(Label l) {
        this.label4 = l;
    }
    private Upload fileUpload2 = new Upload();

    public Upload getFileUpload2() {
        return fileUpload2;
    }

    public void setFileUpload2(Upload u) {
        this.fileUpload2 = u;
    }
    private DropDown dropDown2 = new DropDown();

    public DropDown getDropDown2() {
        return dropDown2;
    }

    public void setDropDown2(DropDown dd) {
        this.dropDown2 = dd;
    }
    private SingleSelectOptionsList dropDown2DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown2DefaultOptions() {
        return dropDown2DefaultOptions;
    }

    public void setDropDown2DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown2DefaultOptions = ssol;
    }
    private Upload fileUpload3 = new Upload();

    public Upload getFileUpload3() {
        return fileUpload3;
    }

    public void setFileUpload3(Upload u) {
        this.fileUpload3 = u;
    }
    private DropDown dropDown3 = new DropDown();

    public DropDown getDropDown3() {
        return dropDown3;
    }

    public void setDropDown3(DropDown dd) {
        this.dropDown3 = dd;
    }
    private SingleSelectOptionsList dropDown3DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown3DefaultOptions() {
        return dropDown3DefaultOptions;
    }

    public void setDropDown3DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown3DefaultOptions = ssol;
    }
    private Upload fileUpload4 = new Upload();

    public Upload getFileUpload4() {
        return fileUpload4;
    }

    public void setFileUpload4(Upload u) {
        this.fileUpload4 = u;
    }
    private DropDown dropDown4 = new DropDown();

    public DropDown getDropDown4() {
        return dropDown4;
    }

    public void setDropDown4(DropDown dd) {
        this.dropDown4 = dd;
    }
    private SingleSelectOptionsList dropDown4DefaultOptions = new SingleSelectOptionsList();

    public SingleSelectOptionsList getDropDown4DefaultOptions() {
        return dropDown4DefaultOptions;
    }

    public void setDropDown4DefaultOptions(SingleSelectOptionsList ssol) {
        this.dropDown4DefaultOptions = ssol;
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
    private Checkbox checkbox_en = new Checkbox();

    public Checkbox getCheckbox_en() {
        return checkbox_en;
    }

    public void setCheckbox_en(Checkbox c) {
        this.checkbox_en = c;
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
public static String PARSER_STRING1;
public static String PARSER_STRING2;
public static String PARSER_STRING3;
public static String PARSER_STRING4;
public static String SELECTED_LANGUAGES;
public static String ADD_RESOURCES;
public static String UPDATE_STRING;
public static String COMMAND_LINE ="pslcmd.exe /newproject:";
private static StringBuilder stringBuff = new StringBuilder();
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
            //fileUpload1.setText(fileUpload1_path);
          //  fileUpload1.setText(name);
             
            checkbox_ar.setSelected(true);
            checkbox_es.setSelected(true);
            checkbox_de.setSelected(true);
            checkbox_fr.setSelected(true);
            checkbox_it.setSelected(true);
            checkbox_ja.setSelected(true);
            checkbox_ptBR.setSelected(true);
            checkbox_ru.setSelected(true);
            checkbox_zhcn.setSelected(true);
            checkbox_en.setSelected(true);
        } 
        return null;
    }

    public String unchekcall_button_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
        boolean isUnchecked = true;
        if (isUnchecked)
        {
            checkbox_ar.setSelected(false);
            checkbox_es.setSelected(false);
            checkbox_de.setSelected(false);
            checkbox_fr.setSelected(false);
            checkbox_it.setSelected(false);
            checkbox_ja.setSelected(false);
            checkbox_ptBR.setSelected(false);
            checkbox_ru.setSelected(false);
            checkbox_zhcn.setSelected(false);
            checkbox_en.setSelected(false);
        }  
        return null;
    }

    public String submit_Button_action() {
        // TODO: Process the action. Return value is a navigation
        // case name where null will return to the same page.
                            
        ID = Integer.toString(FOLDER_ID);
        stringBuff.delete(0,  stringBuff.length());
        PARSER_STRING1 ="";
        PARSER_STRING2 ="";
        PARSER_STRING3 ="";
        PARSER_STRING4 ="";
        SELECTED_LANGUAGES = "";
        COMMAND_LINE = "pslcmd.exe /newproject:";
        ADD_RESOURCES = "";
        UPDATE_STRING="/update ";
        
        if (checkbox_ar.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"ar\" ";
           // UPDATE_STRING = UPDATE_STRING + "\"/options:C:\\Program Files (x86)\\SDL Passolo 2011\\OptionFiles\\Pseudo_ar.pslopt\" /simulate lang:ar";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files (x86)\\SDL Passolo 2011\\OptionFiles\\Pseudo_ar.pslopt\" /simulate lang:ar"; 
        }     
        
        if (checkbox_es.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"es\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files (x86)\\SDL Passolo 2011\\OptionFiles\\Pseudo_es.pslopt\" /simulate lang:es";  
        }  
        
        if (checkbox_de.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"de\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files (x86)\\SDL Passolo 2011\\OptionFiles\\Pseudo_de.pslopt\" /simulate lang:de"; 
 
        } 
        
        if (checkbox_fr.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"fr\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files (x86)\\SDL Passolo 2011\\OptionFiles\\Pseudo_fr.pslopt\" /simulate lang:fr"; 
 
        } 
        
        if (checkbox_it.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"it\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files (x86)\\SDL Passolo 2011\\OptionFiles\\Pseudo_it.pslopt\" /simulate lang:it"; 
 
        } 
        
        if (checkbox_ja.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"ja\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files (x86)\\SDL Passolo 2011\\OptionFiles\\Pseudo_ja.pslopt\" /simulate lang:ja"; 
 
        } 
        
        if (checkbox_ptBR.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"pt-BR\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files (x86)\\SDL Passolo 2011\\OptionFiles\\Pseudo_pt-BR.pslopt\" /simulate lang:pt-BR"; 
 
        } 
        
        if (checkbox_ru.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"ru\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files (x86)\\SDL Passolo 2011\\OptionFiles\\Pseudo_ru.pslopt\" /simulate lang:ru"; 
 
        } 
        
        if (checkbox_zhcn.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"zh-CN\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files (x86)\\SDL Passolo 2011\\OptionFiles\\Pseudo_zh-CN.pslopt\" /simulate lang:zh-CN"; 
 
        } 
        
        if (checkbox_en.isChecked())
        {
            SELECTED_LANGUAGES = SELECTED_LANGUAGES + "/addlang:\"en\" ";
            UPDATE_STRING = UPDATE_STRING + " \"/options:C:\\Program Files (x86)\\SDL Passolo 2011\\OptionFiles\\Pseudo_en.pslopt\" /simulate lang:en"; 
 
        } 
        
      
        
        UploadedFile uploadedFile1 = (UploadedFile) fileUpload1.getUploadedFile();    
                
        if( uploadedFile1 == null )
            
        return null;
        
        try {             
             String bb1 = uploadedFile1.getOriginalName();
             
             String cc1 = "";
             
             if (bb1.contains("\\"))
             {        
                cc1 = bb1.substring(bb1.lastIndexOf("\\"), bb1.length());
             }
             else
             {
                cc1 = "\\" + bb1;
             }
             
             File folder1 = new File (PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload");
             
             if (!folder1.exists())
             {
                folder1.mkdirs();
             }    
             
             File folder1_download = new File (PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "download");
             
             if (!folder1_download.exists())
             {
                folder1_download.mkdirs();
             }  
             
             File folder1_script = new File (PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "batch_script");
             
             if (!folder1_script.exists())
             {
                folder1_script.mkdirs();
             } 
             
             File file1 = new File(PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + cc1);             

             uploadedFile1.write(file1);  
             PARSER_STRING1 = getParser(dropDown1.getSelected().toString());
             String test = dropDown1.getSelected().toString();
             //textArea1.setText(test);
             
             ADD_RESOURCES = ADD_RESOURCES + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + cc1 +  " \"" + PARSER_STRING1 + "\" " ;
             
             
             if (file1.exists())
             {   
                 try {
                   FOLDER_ID = FOLDER_ID + 1;  
                   writeProperties("passolo");
                 } catch(Exception e)
                    {
                        e.printStackTrace();
                    }
               // textArea1.setText("Waiting for the processed file..." + bb1);  
             }
            } catch (Exception ex) 
              {
                error("Cannot upload file: " + uploadedFile1.getOriginalName());
              }
   
        UploadedFile uploadedFile2  = (UploadedFile) fileUpload2.getUploadedFile();
        
        if( uploadedFile2 == null )

        return null;
        
        try {
             
             String bb2= uploadedFile2.getOriginalName();
             
             String cc2 = "";
             
             if (bb2.contains("\\"))
             {        
                cc2 = bb2.substring(bb2.lastIndexOf("\\"), bb2.length());
             }
             
             else
             {
                cc2 = "\\" + bb2;
             }

             File folder2 = new File (PROJECT_ROOT_FOLDER + "\\" + ID  + "\\" + "upload");
             
             if (!folder2.exists())
             {
                folder2.mkdirs();
             }    
             
             File folder2_script = new File (PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "batch_script");
             
             if (!folder2_script.exists())
             {
                folder2_script.mkdirs();
             } 
             
             File folder2_download = new File (PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "download");
             
             if (!folder2_download.exists())
             {
                folder2_download.mkdirs();
             }  
             
             File file2 = new File(PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + cc2);

             uploadedFile2.write(file2);
             
             PARSER_STRING2 = getParser(dropDown2.getSelected().toString());
             
             ADD_RESOURCES = ADD_RESOURCES + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + cc2 +  " \"" + PARSER_STRING2 + "\" " ;
             
             if (file2.exists())
             {        
              //  textArea1.setText("Waiting for the processed file..." + bb2);  
             }
            } catch (Exception ex) {

              // error("Cannot upload file: " + justFileName);
              error("Cannot upload file: " + uploadedFile2.getOriginalName());
            }
        
            UploadedFile uploadedFile3  = (UploadedFile) fileUpload3.getUploadedFile();
        
            if( uploadedFile3 == null )

            return null;
        
            try {
             
             String bb3 = uploadedFile3.getOriginalName();
             
             String cc3 = "";
             
             if (bb3.contains("\\"))
             {        
                cc3 = bb3.substring(bb3.lastIndexOf("\\"), bb3.length());
             }
             
             else
             {
                cc3 = "\\" + bb3;
             }
             
             File folder3 = new File (PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload");
             
             if (!folder3.exists())
             {
                folder3.mkdirs();
             }    
             
             File folder3_script = new File (PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "batch_script");
             
             if (!folder3_script.exists())
             {
                folder3_script.mkdirs();
             } 
                          
             File folder3_download = new File (PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "download");
             
             if (!folder3_download.exists())
             {
                folder3_download.mkdirs();
             }  
                          
             File file3 = new File(PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + cc3);

             uploadedFile3.write(file3);
             
             PARSER_STRING3 = getParser(dropDown3.getSelected().toString());
             
             ADD_RESOURCES = ADD_RESOURCES + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + cc3 +   " \"" + PARSER_STRING3 + "\" " ;
             
             if (file3.exists())
             {        
              //  textArea1.setText("Waiting for the processed file..." + bb3);  
             }
            } catch (Exception ex) {

              // error("Cannot upload file: " + justFileName);
              error("Cannot upload file: " + uploadedFile3.getOriginalName());
            }
            
            UploadedFile uploadedFile4  = (UploadedFile) fileUpload4.getUploadedFile();
        
            if( uploadedFile4 == null )

            return null;
        
            try {
             
             String bb4 = uploadedFile4.getOriginalName();
             
             String cc4 = "";
             
             if (bb4.contains("\\"))
             {        
                cc4 = bb4.substring(bb4.lastIndexOf("\\"), bb4.length());
             }
             
             else
             {
                cc4 = "\\" + bb4;
             }
             
             File folder4 = new File (PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload");
             
             if (!folder4.exists())
             {
                folder4.mkdirs();
             }    
             
             File folder4_script = new File (PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "batch_script");
             
             if (!folder4_script.exists())
             {
                folder4_script.mkdirs();
             } 
                          
             File folder4_download = new File (PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "download");
             
             if (!folder4_download.exists())
             {
                folder4_download.mkdirs();
             }  
                          
             File file4 = new File(PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + cc4);

             uploadedFile4.write(file4);
             
             PARSER_STRING4 = getParser(dropDown4.getSelected().toString());
             
             ADD_RESOURCES = ADD_RESOURCES + "/addsource:" + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + cc4 +   " \"" + PARSER_STRING4 + "\" " ;
             
             if (file4.exists())
             {        
               // textArea1.setText("Waiting for the processed file..." + bb4);  
             }
            } catch (Exception ex) {

              // error("Cannot upload file: " + justFileName);
              error("Cannot upload file: " + uploadedFile2.getOriginalName());
            }
            
            COMMAND_LINE = COMMAND_LINE + PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "upload" + "\\" + ID + ".lpu " + SELECTED_LANGUAGES + ADD_RESOURCES + UPDATE_STRING;
          //  textArea1.setText(COMMAND_LINE);
            stringBuff.append(COMMAND_LINE).append(System.getProperty("line.separator"));
            createReportFile(PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "batch_script", ID);
            generatePassolo(PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "batch_script" + "\\" + ID + ".bat", PROJECT_ROOT_FOLDER + "\\" + ID + "\\" + "batch_script" + "\\" + ID + ".log");
        return null;
    }

public static String getParser(String selectedfiletype)
{
String filetype ="";    
try 
    {  
    
        if (selectedfiletype.equalsIgnoreCase("item1"))
        {
            log1(selectedfiletype);
            filetype = "Win32";
        }   
    
        else if (selectedfiletype.equalsIgnoreCase("item2"))
        {
            log1(selectedfiletype);
            filetype = "Win64";
        }  
    
        else if (selectedfiletype.equalsIgnoreCase("item3"))
        {
            log1(selectedfiletype);
            filetype = "parser:AddIn:Microsoft .NET Parser";
        }
    
        else if (selectedfiletype.equalsIgnoreCase("item4"))
        {
            log1(selectedfiletype);
            filetype = "parser:AddIn:XML Parser";
        }        
        else
        {
            log1(selectedfiletype);
            filetype ="default";        
        }    
    } catch (Exception e)
      { 
        log1("Error in defining file type " + e);
      } 
      return filetype;
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
        log1("Exception in creating report file " + e);
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
    windowsCmd[3] = ">";
    windowsCmd[4] = log_file_name; 
 
    try 
    {
        Process p=Runtime.getRuntime().exec(windowsCmd);
    } catch (IOException ex) {
        }  
}    
    public static synchronized void log1(String msg) 
    {
    DataOutputStream dos = null;
    try 
    {
        dos = new DataOutputStream(new FileOutputStream(userDir + "\\log.txt", true));
        dos.writeBytes(msg + System.getProperty("line.separator"));
        dos.close();
    } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
        }
    }    
    
public void readProperties(String output)
{   
    FileInputStream in =null;
    Properties props = new Properties();
    try
    {
        String path = new java.io.File(".").getCanonicalPath();        
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

}

