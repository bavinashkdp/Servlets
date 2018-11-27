function validation(thisform)
{
   with(thisform)
   {
      if(validateFileExtension(file, "valid_msg", "pdf/office/image files are only allowed!",
      new Array("jpg","pdf","jpeg","gif","png","doc","docx","xls","xlsx","ppt","txt")) == false)
      {
         return false;
      }
      if(validateFileSize(file,1048576, "valid_msg", "Document size should be less than 1MB !")==false)
      {
         return false;
      }
   }
}