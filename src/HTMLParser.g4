parser grammar HTMLParser;

options { tokenVocab=HTMLLexer; }

htmlDocument
    : scriptletOrSeaWs* XML? scriptletOrSeaWs* DTD? scriptletOrSeaWs* htmlElements*
    ;

scriptletOrSeaWs
    : SCRIPTLET
    | SEA_WS
    ;

htmlElements
    : htmlMisc* htmlElement htmlMisc*
    ;

htmlElement
    : TAG_OPEN TAG_NAME htmlAttribute*
      (TAG_CLOSE (htmlContent TAG_OPEN TAG_SLASH TAG_NAME TAG_CLOSE)? | TAG_SLASH_CLOSE)
    | SCRIPTLET
    | script
    | style
    ;

htmlContent
    : htmlChardata? ((htmlElement | CDATA | htmlComment) htmlChardata?)*
    ;

htmlAttribute
    :
      NGFOR NG_ATTRBIUTE SINGLE_QOUTE ngfor_body SINGLE_QOUTE
    | TAG_NAME (TAG_EQUALS  ATTVALUE_VALUE)?
    ;

ngfor_body: ID IN ID;


htmlChardata
    : HTML_TEXT
    | SEA_WS
    ;

htmlMisc
    : htmlComment
    | SEA_WS
    ;

htmlComment
    : HTML_COMMENT
    | HTML_CONDITIONAL_COMMENT
    ;

script
    : SCRIPT_OPEN (SCRIPT_BODY | SCRIPT_SHORT_BODY)
    ;

style
    : STYLE_OPEN (STYLE_BODY | STYLE_SHORT_BODY)
    ;